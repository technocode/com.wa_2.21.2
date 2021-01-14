package X;

/* renamed from: X.1nb  reason: invalid class name and case insensitive filesystem */
public class C37131nb implements AnonymousClass1F7 {
    @Override // X.AnonymousClass1F7
    public boolean A2b(C12440i6 r7, C12490iB r8, StringBuilder sb, String[] strArr) {
        int length;
        int i;
        String[] split = C12440i6.A0M.split(sb.toString());
        if (r8.hasExtension) {
            length = split.length;
            i = length - 2;
        } else {
            length = split.length;
            i = length - 1;
        }
        if (length == 1 || split[i].contains(C12440i6.A01(r8))) {
            return true;
        }
        int length2 = strArr.length - 1;
        while (length2 > 0) {
            if (i < 0 || !split[i].equals(strArr[length2])) {
                return false;
            }
            length2--;
            i--;
        }
        if (i < 0 || !split[i].endsWith(strArr[0])) {
            return false;
        }
        return true;
    }
}
