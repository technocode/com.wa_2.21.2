package X;

import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.util.Log;

/* renamed from: X.1ux  reason: invalid class name and case insensitive filesystem */
public class C41391ux {
    public final /* synthetic */ GoogleBackupService A00;

    public C41391ux(GoogleBackupService googleBackupService) {
        this.A00 = googleBackupService;
    }

    public void A00() {
        AnonymousClass00E.A01();
        StringBuilder sb = new StringBuilder("gdrive/onHandlerConnected ");
        sb.append(Thread.currentThread());
        Log.i(sb.toString());
        this.A00.A08.open();
    }

    public void A01() {
        AnonymousClass00E.A01();
        StringBuilder sb = new StringBuilder("gdrive/onHandlerDisconnected ");
        sb.append(Thread.currentThread());
        Log.i(sb.toString());
        this.A00.A08.close();
    }
}
