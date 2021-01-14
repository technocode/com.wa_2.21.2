package X;

import java.util.concurrent.Callable;

/* renamed from: X.0zD  reason: invalid class name and case insensitive filesystem */
public class CallableC21720zD implements Callable {
    public final /* synthetic */ C33221gO A00;

    public CallableC21720zD(C33221gO r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C21780zJ r3 = this.A00.A00;
        r3.A0I.A01("Method onCameraSessionActive must be called on Optic Thread.");
        r3.A0N.A03(new CallableC21760zH(r3, new C33291gV()), "camera_session_active_on_camera_handler_thread");
        return null;
    }
}
