package X;

import android.util.SparseArray;

/* renamed from: X.0iK  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC12580iK {
    public static final AnonymousClass05W A00 = new AnonymousClass05W(1);

    static {
        SparseArray sparseArray = new SparseArray(2);
        sparseArray.append(1, new String[]{"januarja", "februarja", "marca", "aprila", "maja", "junija", "julija", "avgusta", "septembra", "oktobra", "novembra", "decembra"});
        sparseArray.append(2, new String[]{"januarjem", "februarjem", "marcem", "aprilom", "majem", "junijem", "julijem", "avgustom", "septembrom", "oktobrom", "novembrom", "decembrom"});
        A00.put("sl", sparseArray);
    }

    public static String[] A00(AnonymousClass01X r3) {
        return new String[]{r3.A05(260), r3.A05(259), r3.A05(263), r3.A05(256), r3.A05(264), r3.A05(262), r3.A05(261), r3.A05(257), r3.A05(267), r3.A05(266), r3.A05(265), r3.A05(258)};
    }

    public static String[] A01(AnonymousClass01X r3, int i) {
        String[] strArr;
        SparseArray sparseArray = (SparseArray) A00.get(r3.A04());
        return (sparseArray == null || (strArr = (String[]) sparseArray.get(i)) == null) ? new String[]{r3.A05(248), r3.A05(247), r3.A05(251), r3.A05(244), r3.A05(252), r3.A05(250), r3.A05(249), r3.A05(245), r3.A05(255), r3.A05(254), r3.A05(253), r3.A05(246)} : strArr;
    }
}
