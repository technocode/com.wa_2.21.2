package X;

import android.view.View;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.doodle.TitleBarComponent;

/* renamed from: X.2M6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2M6 implements View.OnLongClickListener {
    public final /* synthetic */ TitleBarComponent A00;

    public /* synthetic */ AnonymousClass2M6(TitleBarComponent titleBarComponent) {
        this.A00 = titleBarComponent;
    }

    public final boolean onLongClick(View view) {
        TitleBarComponent titleBarComponent = this.A00;
        DoodleView doodleView = titleBarComponent.A03;
        if (doodleView == null || titleBarComponent.A02 == null || titleBarComponent.A07 == null) {
            return true;
        }
        C48592Mx r1 = doodleView.A0U;
        r1.A01.clear();
        r1.A00.A00.clear();
        doodleView.A0R = null;
        doodleView.A0X = false;
        doodleView.invalidate();
        titleBarComponent.A03.A0Y = false;
        titleBarComponent.A0B.setVisibility(8);
        titleBarComponent.A07.A02();
        titleBarComponent.A02.A00.A04();
        return true;
    }
}
