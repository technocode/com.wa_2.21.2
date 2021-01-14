package X;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.whatsapp.contact.sync.ContactsSyncAdapterService;
import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;

/* renamed from: X.2Gp  reason: invalid class name and case insensitive filesystem */
public class C47132Gp extends AbstractThreadedSyncAdapter {
    public C47132Gp(Context context) {
        super(context, true);
    }

    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        AnonymousClass0Hz r1 = new AnonymousClass0Hz(EnumC03840Hy.BACKGROUND_DELTA);
        r1.A05 = true;
        r1.A06 = true;
        r1.A02();
        AnonymousClass0I0 A01 = r1.A01();
        AnonymousClass0RC r4 = new AnonymousClass0RC(true);
        A01.A03.add(r4);
        AnonymousClass0I7 r3 = ContactsSyncAdapterService.A02;
        r3.A0Q.execute(new RunnableEBaseShape2S0200000_I0_1(r3, A01, 8));
        try {
            r4.get();
        } catch (InterruptedException unused) {
        } catch (ExecutionException e) {
            Log.e(e);
            ContactsSyncAdapterService.A01.A05(e, 3);
        }
    }
}
