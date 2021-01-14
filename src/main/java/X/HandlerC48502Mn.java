package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.doodle.shapepicker.ShapeItemView;

/* renamed from: X.2Mn  reason: invalid class name and case insensitive filesystem */
public final class HandlerC48502Mn extends Handler {
    public final /* synthetic */ C48522Mp A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC48502Mn(C48522Mp r2, Looper looper) {
        super(looper);
        this.A00 = r2;
        if (looper != null) {
            return;
        }
        throw null;
    }

    public void handleMessage(Message message) {
        if (message.obj != null) {
            C48522Mp r0 = this.A00;
            Bundle data = message.getData();
            if (r0 != null) {
                String string = data.getString("tag_bundle_key");
                if (string != null) {
                    ShapeItemView shapeItemView = (ShapeItemView) message.obj;
                    if (string.equals(shapeItemView.A00)) {
                        shapeItemView.setImageDrawable((Drawable) shapeItemView.getTag());
                        return;
                    }
                    return;
                }
                throw null;
            }
            throw null;
        }
    }
}
