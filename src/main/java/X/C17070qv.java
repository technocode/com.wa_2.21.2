package X;

import android.database.DatabaseErrorHandler;

/* renamed from: X.0qv  reason: invalid class name and case insensitive filesystem */
public class C17070qv implements DatabaseErrorHandler {
    public final /* synthetic */ AbstractC17000qo A00;
    public final /* synthetic */ C30761bu[] A01;

    public C17070qv(AbstractC17000qo r1, C30761bu[] r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r4 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r1 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r1.hasNext() != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        X.AbstractC17000qo.A00((java.lang.String) r1.next().second);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        X.AbstractC17000qo.A00(r3.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0035 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052 A[ExcHandler: all (r2v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r4 
      PHI: (r4v1 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r4v0 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r4v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r4v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0031, B:7:0x0035, B:8:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCorruption(android.database.sqlite.SQLiteDatabase r6) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17070qv.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
