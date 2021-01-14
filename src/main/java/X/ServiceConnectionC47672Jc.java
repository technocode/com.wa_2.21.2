package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2Jc  reason: invalid class name and case insensitive filesystem */
public class ServiceConnectionC47672Jc implements ServiceConnection {
    public final /* synthetic */ ConversationsFragment A00;

    public ServiceConnectionC47672Jc(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ConversationsFragment conversationsFragment = this.A00;
        conversationsFragment.A0G = ((BinderC27531Qj) iBinder).A00;
        conversationsFragment.A0K = new C59382nY(conversationsFragment);
        conversationsFragment.A1u.ANF(new RunnableEBaseShape9S0100000_I1_4(this, 11));
        Log.i("conversations/gdrive-service-connected");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ConversationsFragment conversationsFragment = this.A00;
        GoogleBackupService googleBackupService = conversationsFragment.A0G;
        googleBackupService.A0J.A01(conversationsFragment.A0K);
        conversationsFragment.A0G = null;
        Log.i("conversations/gdrive-service-disconnected");
    }
}
