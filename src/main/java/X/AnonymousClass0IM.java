package X;

import com.whatsapp.util.Log;

/* renamed from: X.0IM  reason: invalid class name */
public class AnonymousClass0IM implements AnonymousClass0IN {
    public final /* synthetic */ AnonymousClass0IL A00;

    public AnonymousClass0IM(AnonymousClass0IL r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0IN
    public void AAB(String str, int i, int i2, long j) {
        StringBuilder sb = new StringBuilder("contactsyncmanager/handleSyncContactError/error sid=");
        sb.append(str);
        sb.append(" index=");
        sb.append(i);
        sb.append(" code=");
        sb.append(i2);
        sb.append(" backoff=");
        sb.append(j);
        Log.e(sb.toString());
        if (j > 0) {
            AnonymousClass0IL r1 = this.A00;
            AnonymousClass008.A0g(r1.A06, "contact_sync_backoff", r1.A0A.A05() + j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0233, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0236, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x023a, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0IN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AAC(java.lang.String r16, int r17, X.AnonymousClass0RO r18) {
        /*
        // Method dump skipped, instructions count: 578
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IM.AAC(java.lang.String, int, X.0RO):void");
    }

    @Override // X.AnonymousClass0IN
    public void AAD(String str, int i, int i2, long j) {
        StringBuilder sb = new StringBuilder("contactsyncmanager/handleSyncSidelistError/error sid=");
        sb.append(str);
        sb.append(" index=");
        sb.append(i);
        sb.append(" code=");
        sb.append(i2);
        sb.append(" backoff=");
        sb.append(j);
        Log.e(sb.toString());
        if (j > 0) {
            AnonymousClass0IL r1 = this.A00;
            AnonymousClass008.A0g(r1.A06, "sidelist_sync_backoff", r1.A0A.A05() + j);
        }
    }
}
