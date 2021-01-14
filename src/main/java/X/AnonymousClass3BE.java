package X;

import java.util.List;

/* renamed from: X.3BE  reason: invalid class name */
public class AnonymousClass3BE {
    public static List A01;
    public String A00 = "";

    public AnonymousClass3BE(String str) {
        try {
            new AnonymousClass3BD(str);
            A01 = AnonymousClass3BD.A02;
        } catch (AnonymousClass3BF e) {
            throw e;
        } catch (Exception unused) {
            throw new AnonymousClass3BF(AnonymousClass3BG.UNKNOWN_ERROR);
        }
    }

    public static String A00(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        StringBuilder sb = new StringBuilder(100);
        if (str2 != null && !str2.isEmpty()) {
            sb.append(str2);
            sb.append("|");
        }
        if (str != null && !str.isEmpty()) {
            sb.append(str);
            sb.append("|");
        }
        if (str6 != null && !str6.isEmpty()) {
            sb.append(str6);
            sb.append("|");
        }
        if (str7 != null && !str7.isEmpty()) {
            sb.append(str7);
            sb.append("|");
        }
        if (str3 != null && !str3.isEmpty()) {
            sb.append(str3);
            sb.append("|");
        }
        if (str5 != null && !str5.isEmpty()) {
            sb.append(str5);
            sb.append("|");
        }
        if (str4 != null && !str4.isEmpty()) {
            sb.append(str4);
        }
        int lastIndexOf = sb.lastIndexOf("|");
        if (lastIndexOf != -1 && lastIndexOf == sb.length() - 1) {
            sb.deleteCharAt(lastIndexOf);
        }
        return sb.toString();
    }
}
