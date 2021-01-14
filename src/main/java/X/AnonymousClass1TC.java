package X;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.1TC  reason: invalid class name */
public class AnonymousClass1TC extends CountDownTimer {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ AnonymousClass05q A02;
    public final /* synthetic */ C43011xe A03;
    public final /* synthetic */ C46502As A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1TC(C43011xe r3, long j, TextView textView, View view, C46502As r8, AnonymousClass05q r9) {
        super(j, 1000);
        this.A03 = r3;
        this.A01 = textView;
        this.A00 = view;
        this.A04 = r8;
        this.A02 = r9;
    }

    public void onFinish() {
        this.A00.setVisibility(8);
        C46502As r1 = this.A04;
        AbstractC009505y r3 = r1.A02;
        if (r3 != null) {
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() == 0) {
                arrayList.add(C008805h.A0T(r1));
                C008805h.A0P(r3, new C010106g(arrayList), this.A02);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }

    public void onTick(long j) {
        this.A01.setText(C002001d.A1W(this.A03.A00, j / 1000));
    }
}
