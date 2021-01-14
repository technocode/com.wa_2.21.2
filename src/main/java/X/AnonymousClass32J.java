package X;

import com.whatsapp.status.playback.StatusPlaybackActivity;

/* renamed from: X.32J  reason: invalid class name */
public final /* synthetic */ class AnonymousClass32J extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ StatusPlaybackActivity A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass32J(StatusPlaybackActivity statusPlaybackActivity, String str, int i, int i2) {
        this.A02 = statusPlaybackActivity;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        this.A02.A0V(this.A03, this.A00, this.A01);
    }
}
