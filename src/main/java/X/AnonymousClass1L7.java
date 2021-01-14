package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.whatsapp.Conversation;

/* renamed from: X.1L7  reason: invalid class name */
public class AnonymousClass1L7 extends ViewOutlineProvider {
    public final /* synthetic */ Conversation A00;

    public AnonymousClass1L7(Conversation conversation) {
        this.A00 = conversation;
    }

    public void getOutline(View view, Outline outline) {
        int i = (int) (this.A00.A2I.A00 * 48.0f);
        outline.setOval(0, 0, i, i);
    }
}
