package com.numbers;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
import java.io.Serial;

public class JNumberTextField extends JTextField {

    @Serial
    private static final long serialVersionUID = 1710412620735921419L;

    public static final char DOT = '.';
    public static final char NEGATIVE = '-';
    public static final String BLANK = "";
    public static final int DEF_PRECISION = 2;

    public static final int NUMERIC = 2;
    public static final int DECIMAL = 3;

    public static final String FM_NUMERIC = "0123456789";
    public static final String FM_DECIMAL = FM_NUMERIC + DOT;

    private int maxLength = 0;
    private int format = NUMERIC;
    private String negativeChars = BLANK;
    private String allowedChars = null;
    private boolean allowNegative = false;
    private int precision = 0;

    protected PlainDocument numberFieldFilter;

    public JNumberTextField() {
        this(10, NUMERIC);
    }

    public JNumberTextField(int maxLen) {
        this(maxLen, NUMERIC);
    }

    public JNumberTextField(int maxLen, int format) {
        setAllowNegative(true);
        setMaxLength(maxLen);
        setFormat(format);

        numberFieldFilter = new JNumberFieldFilter();
        super.setDocument(numberFieldFilter);
    }

    public void setMaxLength(int maxLen) {
        maxLength = Math.max(maxLen, 0);
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setPrecision(int precision) {
        if (format == NUMERIC) {
            return;
        }

        if (precision >= 0) {
            this.precision = precision;
        }
        else {
            this.precision = DEF_PRECISION;
        }
    }

    public int getPrecision() {
        return precision;
    }

    public Number getNumber() {
        Number number;

        if (format == NUMERIC) {
            number = Integer.valueOf(getText());
        }
        else {
            number = Double.valueOf(getText());
        }
        return number;
    }

    public void setNumber(Number value) {
        setText(String.valueOf(value));
    }

    public int getInt() {
        return Integer.parseInt(getText());
    }

    public void setInt(int value) {
        setText(String.valueOf(value));
    }

    public float getFloat() {
        return Float.parseFloat(getText());
    }

    public void setFloat(float value) {
        setText(String.valueOf(value));
    }

    public double getDouble() {
        return Double.parseDouble(getText());
    }

    public void setDouble(double value) {
        setText(String.valueOf(value));
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        if (format == DECIMAL) {
            this.format = DECIMAL;
            this.precision = DEF_PRECISION;
            this.allowedChars = FM_DECIMAL;
        } else {
            this.format = NUMERIC;
            this.precision = 0;
            this.allowedChars = FM_NUMERIC;
        }
    }

    public void setAllowNegative(boolean value) {
        allowNegative = value;

        if (value) {
            negativeChars = "" + NEGATIVE;
        }
        else {
            negativeChars = BLANK;
        }
    }

    public boolean isAllowNegative() {
        return allowNegative;
    }

    public void setDocument(Document document) {
    }

    class JNumberFieldFilter extends PlainDocument {
        @Serial
        private static final long serialVersionUID = -903268702785306480L;

        public JNumberFieldFilter() {
            super();
        }

        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

            String text = getText(0, offset) + str + getText(offset, (getLength() - offset));

            int precisionLength = 0;
            int dotLength = 0;
            int minusLength = 0;
            int textLength = text.length();

            if (str == null) {
                return;
            }

            for (int i = 0; i < str.length(); i++) {
                if ((allowedChars + negativeChars).indexOf(str.charAt(i)) == -1) {
                    return;
                }
            }

            try {
                if (format == NUMERIC) {
                    if (!((text.equals(negativeChars)) && (text.length() == 1))) {
                        Long.valueOf(text);
                    }
                } else if (format == DECIMAL) {
                    if (!((text.equals(negativeChars)) && (text.length() == 1))) {
                        Double.valueOf(text);
                    }

                    int dotIndex = text.indexOf(DOT);
                    if (dotIndex != -1) {
                        dotLength = 1;
                        precisionLength = textLength - dotIndex - dotLength;

                        if (precisionLength > precision) {
                            return;
                        }
                    }
                }
            } catch (Exception ex) {
                return;
            }

            if (text.startsWith("" + NEGATIVE)) {
                if (!allowNegative) {
                    return;
                }
                else {
                    minusLength = 1;
                }
            }

            if (maxLength < (textLength - dotLength - precisionLength - minusLength)) {
                return;
            }

            super.insertString(offset, str, attr);
        }
    }
}
