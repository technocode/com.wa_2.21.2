package X;

/* renamed from: X.2T0  reason: invalid class name */
public class AnonymousClass2T0 {
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public AnonymousClass2T0(String str, Boolean bool) {
        String str2;
        int indexOf;
        int indexOf2;
        String str3 = null;
        if (str == null || (indexOf2 = str.indexOf("filetype=")) < 0) {
            str2 = null;
        } else {
            int i = indexOf2 + 9;
            int indexOf3 = str.indexOf(59, i);
            if (indexOf3 >= 0) {
                str2 = str.substring(i, indexOf3);
            } else {
                str2 = str.substring(i);
            }
        }
        this.A02 = str2;
        if (str != null && (indexOf = str.indexOf("filehash=")) >= 0) {
            int i2 = indexOf + 9;
            int indexOf4 = str.indexOf(59, i2);
            str3 = indexOf4 >= 0 ? str.substring(i2, indexOf4) : str.substring(i2);
        }
        this.A01 = str3;
        this.A00 = bool;
    }
}
