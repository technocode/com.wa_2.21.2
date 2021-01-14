package X;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.DescribeProblemActivity;

/* renamed from: X.1LQ  reason: invalid class name */
public class AnonymousClass1LQ extends ClickableSpan {
    public final /* synthetic */ DescribeProblemActivity A00;

    public AnonymousClass1LQ(DescribeProblemActivity describeProblemActivity) {
        this.A00 = describeProblemActivity;
    }

    public void onClick(View view) {
        DescribeProblemActivity describeProblemActivity = this.A00;
        describeProblemActivity.startActivity(new Intent("android.intent.action.VIEW", describeProblemActivity.A0D.A03("general", null, null)));
    }
}
