package com.whatsapp;

import X.AnonymousClass008;
import java.io.Serializable;
import java.util.Arrays;

public class TextData implements Serializable {
    public static final long serialVersionUID = 1;
    public int backgroundColor;
    public int fontStyle;
    public int textColor;
    public byte[] thumbnail;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextData.class == obj.getClass()) {
            TextData textData = (TextData) obj;
            if (this.fontStyle == textData.fontStyle && this.textColor == textData.textColor && this.backgroundColor == textData.backgroundColor) {
                byte[] bArr = this.thumbnail;
                byte[] bArr2 = textData.thumbnail;
                if (bArr != null) {
                    return Arrays.equals(bArr, bArr2);
                }
                if (bArr2 != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        Object valueOf;
        StringBuilder A0S = AnonymousClass008.A0S("TextData; fontStyle=");
        A0S.append(this.fontStyle);
        A0S.append("; textColor=");
        A0S.append(this.textColor);
        A0S.append("; backgroundColor=");
        A0S.append(this.backgroundColor);
        A0S.append("; thumbnail=");
        byte[] bArr = this.thumbnail;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        A0S.append(valueOf);
        return A0S.toString();
    }
}
