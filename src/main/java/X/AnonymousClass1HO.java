package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.google.android.search.verification.client.R;
import com.whatsapp.AcceptInviteLinkActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1HO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1HO extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ AcceptInviteLinkActivity A00;
    public final /* synthetic */ AnonymousClass2RU A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass1HO(AcceptInviteLinkActivity acceptInviteLinkActivity, String str, AnonymousClass2RU r3) {
        this.A00 = acceptInviteLinkActivity;
        this.A02 = str;
        this.A01 = r3;
    }

    public final void onClick(View view) {
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
        String str = this.A02;
        AnonymousClass2RU r1 = this.A01;
        Log.i("acceptlink/confirmation/ok");
        AnonymousClass02U r6 = r1.A01;
        StringBuilder sb = new StringBuilder("acceptlink/sendjoin/");
        sb.append(str);
        sb.append(" ");
        sb.append(r6);
        Log.i(sb.toString());
        ((TextView) acceptInviteLinkActivity.findViewById(R.id.progress_text)).setText(acceptInviteLinkActivity.A08.A06(R.string.joining_group));
        acceptInviteLinkActivity.findViewById(R.id.progress).setVisibility(0);
        acceptInviteLinkActivity.findViewById(R.id.group_info).setVisibility(4);
        acceptInviteLinkActivity.findViewById(R.id.error).setVisibility(4);
        acceptInviteLinkActivity.A02 = r6;
        acceptInviteLinkActivity.A0E.ANC(new C39311rI(acceptInviteLinkActivity, str), new Void[0]);
    }
}
