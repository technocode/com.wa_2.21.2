package X;

import android.view.View;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.38G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38G implements View.OnLongClickListener {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ VoipActivityV2 A01;

    public /* synthetic */ AnonymousClass38G(VoipActivityV2 voipActivityV2, View.OnClickListener onClickListener) {
        this.A01 = voipActivityV2;
        this.A00 = onClickListener;
    }

    public final boolean onLongClick(View view) {
        return this.A01.A1X(this.A00, view);
    }
}
