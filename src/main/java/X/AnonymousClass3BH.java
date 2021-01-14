package X;

import java.io.Serializable;

/* renamed from: X.3BH  reason: invalid class name */
public class AnonymousClass3BH implements Serializable {
    public String code;
    public String encryptedBase64String;
    public String hmac;
    public String ki;
    public String pid;
    public String type;

    public AnonymousClass3BH(String str, String str2, String str3) {
        this.ki = str;
        this.code = str2;
        this.encryptedBase64String = str3;
    }
}
