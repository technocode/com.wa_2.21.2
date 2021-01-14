package X;

import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3RR  reason: invalid class name */
public class AnonymousClass3RR implements AnonymousClass2L5 {
    public final /* synthetic */ StorageUsageActivity A00;

    public AnonymousClass3RR(StorageUsageActivity storageUsageActivity) {
        this.A00 = storageUsageActivity;
    }

    @Override // X.AnonymousClass2L5
    public void AE0(AnonymousClass2L3 r5) {
        Log.i("storage-usage-activity/fetch chats/completed");
        StorageUsageActivity storageUsageActivity = this.A00;
        ArrayList arrayList = r5.A00;
        storageUsageActivity.A0C = arrayList;
        StorageUsageActivity.A05(storageUsageActivity, arrayList, null, true);
        AnonymousClass02M r2 = storageUsageActivity.A0F;
        r2.A02.post(new RunnableEBaseShape13S0100000_I1_8(this, 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r4.add(r5);
     */
    @Override // X.AnonymousClass2L5
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AE1(X.AnonymousClass2L4 r14) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3RR.AE1(X.2L4):void");
    }

    @Override // X.AnonymousClass2L5
    public void AEt(AnonymousClass02N r4, C28481Um r5) {
        AnonymousClass02M r2 = this.A00.A0F;
        r2.A02.post(new RunnableEBaseShape2S0300000_I1(this, r4, r5, 41));
    }
}
