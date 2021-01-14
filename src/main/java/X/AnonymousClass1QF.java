package X;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/* renamed from: X.1QF  reason: invalid class name */
public final class AnonymousClass1QF implements Comparator {
    public final String A00;
    public final String A01;
    public final DateFormat A02;

    public AnonymousClass1QF(String str, SimpleDateFormat simpleDateFormat) {
        this.A01 = str;
        this.A02 = simpleDateFormat;
        this.A00 = simpleDateFormat.toPattern();
    }

    public final Date A00(File file) {
        String name = file.getName();
        int length = this.A01.length();
        int length2 = this.A00.length() + length;
        if (length2 > name.length()) {
            return null;
        }
        try {
            return this.A02.parse(name.substring(length, length2));
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        Date A002 = A00(file);
        Date A003 = A00(file2);
        if (A002 != null) {
            if (A003 != null) {
                return A002.compareTo(A003);
            }
            return -1;
        } else if (A003 != null) {
            return 1;
        } else {
            return (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
        }
    }
}
