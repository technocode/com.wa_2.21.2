package X;

/* renamed from: X.1nZ  reason: invalid class name and case insensitive filesystem */
public class C37111nZ implements AnonymousClass1F7 {
    @Override // X.AnonymousClass1F7
    public boolean A2b(C12440i6 r5, C12490iB r6, StringBuilder sb, String[] strArr) {
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            int indexOf = sb.indexOf(strArr[i2], i);
            if (indexOf < 0) {
                return false;
            }
            i = indexOf + strArr[i2].length();
            if (i2 == 0 && i < sb.length() && Character.isDigit(sb.charAt(i))) {
                return sb.substring(i - strArr[i2].length()).startsWith(C12440i6.A01(r6));
            }
        }
        return sb.substring(i).contains(r6.extension_);
    }
}
