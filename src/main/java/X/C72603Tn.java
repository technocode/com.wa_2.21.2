package X;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.GroupCallLogActivity;

/* renamed from: X.3Tn  reason: invalid class name and case insensitive filesystem */
public class C72603Tn extends AbstractC11910hD {
    public ImageButton A00;
    public ImageButton A01;
    public ImageView A02;
    public TextView A03;
    public C11930hF A04;

    public C72603Tn(GroupCallLogActivity groupCallLogActivity, View view) {
        super(view);
        this.A02 = (ImageView) view.findViewById(R.id.contact_photo);
        this.A04 = new C11930hF(view, R.id.contact_name, groupCallLogActivity.A08, ((AnonymousClass2C0) groupCallLogActivity).A01, groupCallLogActivity.A0D);
        this.A01 = (ImageButton) view.findViewById(R.id.call_btn);
        this.A00 = (ImageButton) view.findViewById(R.id.video_call_btn);
        this.A03 = (TextView) view.findViewById(R.id.participant_call_log_result);
    }
}
