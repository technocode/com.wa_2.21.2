package X;

import android.graphics.Color;
import java.util.Set;

/* renamed from: X.1OJ  reason: invalid class name */
public class AnonymousClass1OJ {
    public static final float[] A06 = {0.25f, 0.25f, 0.25f, 0.25f, 0.75f, 0.75f, 0.75f, 0.75f};
    public static final float[] A07 = {0.25f, 0.3f, 0.75f, 0.8f, 0.25f, 0.3f, 0.75f, 0.8f};
    public static final int[] A08 = {14557250, 14687296, 3292341, 3292341, 1423676, 1423676, 15990016, 15990016};
    public static final int[] A09 = {4408575, 4408575, 10296875, 10296875, 4696576, 4696576, 3014647, 3014647};
    public final AnonymousClass009 A00;
    public final C000300f A01;
    public final AnonymousClass00C A02;
    public final AnonymousClass00G A03;
    public final AnonymousClass00D A04;
    public final C002701k A05;

    public AnonymousClass1OJ(AnonymousClass00G r1, C002701k r2, AnonymousClass009 r3, C000300f r4, AnonymousClass00C r5, AnonymousClass00D r6) {
        this.A03 = r1;
        this.A05 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A04 = r6;
    }

    public static int A00(int i, int i2) {
        return Math.max(Math.max(Math.abs(Color.red(i) - Color.red(i2)), Math.abs(Color.green(i) - Color.green(i2))), Color.blue(i) - Color.blue(i2));
    }

    public static int A01(int i, int[] iArr) {
        return Math.max(Math.max(Math.abs(Color.red(i) - iArr[0]), Math.abs(Color.green(i) - iArr[1])), Color.blue(i) - iArr[2]);
    }

    public static Integer A02(int i, Set set) {
        Integer valueOf = Integer.valueOf(i);
        do {
            int intValue = valueOf.intValue();
            if (intValue == 1) {
                valueOf = 2;
            } else if (intValue == 2) {
                valueOf = 3;
            } else if (intValue == 3) {
                valueOf = 4;
            } else if (intValue != 4) {
                return null;
            } else {
                valueOf = 1;
            }
            if (valueOf == null || valueOf.intValue() == i) {
                return null;
            }
        } while (set.contains(valueOf));
        return valueOf;
    }

    public static final String A03(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(i));
        sb.append(" (");
        sb.append(Color.red(i));
        sb.append(",");
        sb.append(Color.green(i));
        sb.append(",");
        sb.append(Color.blue(i));
        sb.append(")");
        return sb.toString();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:107:0x0298 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:109:0x029c */
    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v151, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v23, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r5v10, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r4v30, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0381, code lost:
        r3 = new X.AnonymousClass1OI(0, r39);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x038d, code lost:
        if (r41.exists() == false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x038f, code lost:
        r41.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0392, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0476, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x047a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0485, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0499, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04a3, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04a4, code lost:
        if (r11 != null) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04a9, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04ac, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04b0, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04b1, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04ba, code lost:
        r41 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04be, code lost:
        r39 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0643, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x069b, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06a2, code lost:
        if (r41.exists() != false) goto L_0x06a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06a4, code lost:
        r41.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ca, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        r39 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0614  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0623  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x062f  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x063b A[LOOP:0: B:7:0x0053->B:280:0x063b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0643 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:24:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x069b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:28:0x00b6] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x069e  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x064d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0647 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:343:? A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
        // Method dump skipped, instructions count: 1764
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OJ.A04():void");
    }
}
