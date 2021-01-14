package X;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.widget.ImageView;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VideoCallParticipantView;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.39R  reason: invalid class name */
public abstract class AnonymousClass39R {
    public VideoCallParticipantView A00;
    public VideoPort A01;
    public boolean A02;
    public final UserJid A03;
    public final AnonymousClass3TM A04;
    public final AnonymousClass39Q A05;
    public final AnonymousClass39S A06 = new AnonymousClass3U1(this);
    public final String A07;

    public AnonymousClass39R(String str, AnonymousClass39Q r5, UserJid userJid, AnonymousClass3TM r7) {
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/video/");
        sb.append(str);
        sb.append("/VideoParticipantPresenter for ");
        sb.append(userJid);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip/VoipActivityV2/video/");
        this.A07 = AnonymousClass008.A0O(sb2, str, "/");
        this.A03 = userJid;
        this.A05 = r5;
        this.A04 = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0241  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A00() {
        /*
        // Method dump skipped, instructions count: 603
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39R.A00():android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0 < 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Point A01(com.whatsapp.voipcalling.VideoCallParticipantView r4, X.AnonymousClass0QY r5) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AnonymousClass3UN
            if (r0 != 0) goto L_0x0039
            r1 = r3
            X.3UM r1 = (X.AnonymousClass3UM) r1
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0017
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r1.A00
            X.39b r0 = r0.A10
            if (r0 == 0) goto L_0x0017
            int r0 = r0.A00
            int r1 = r0 * 90
            if (r0 >= 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            int r0 = r5.A03
            int r0 = r0 * 90
            int r0 = r0 - r1
            int r0 = r0 + 360
            int r0 = r0 % 360
            int r0 = r0 % 180
            if (r0 == 0) goto L_0x002f
            int r1 = r5.A02
            int r0 = r5.A05
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r0)
            return r2
        L_0x002f:
            int r1 = r5.A05
            int r0 = r5.A02
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r0)
            return r2
        L_0x0039:
            r0 = r3
            X.3UN r0 = (X.AnonymousClass3UN) r0
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            com.whatsapp.voipcalling.camera.VoipCameraManager r2 = r0.A1n
            android.graphics.Point r0 = r2.getAdjustedCameraPreviewSize()
            if (r0 != 0) goto L_0x004e
            boolean r1 = r5.A00()
            if (r1 == 0) goto L_0x004e
            android.graphics.Point r0 = r2.lastAdjustedCameraPreviewSize
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39R.A01(com.whatsapp.voipcalling.VideoCallParticipantView, X.0QY):android.graphics.Point");
    }

    public void A02() {
        if (!(this instanceof AnonymousClass3UN)) {
            AnonymousClass3UM r0 = (AnonymousClass3UM) this;
            UserJid userJid = r0.A03;
            if (!r0.A09()) {
                Voip.stopVideoRenderStream(userJid.getRawString());
                Voip.setVideoDisplayPort(userJid.getRawString(), null);
                return;
            }
            return;
        }
        ((AnonymousClass3UN) this).A00.A0r();
    }

    public final void A03() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A07);
        sb.append("detachFromParticipantView ");
        sb.append(this.A00);
        sb.append(" for ");
        UserJid userJid = this.A03;
        AnonymousClass008.A1Q(sb, userJid);
        VideoCallParticipantView videoCallParticipantView = this.A00;
        if (videoCallParticipantView != null && userJid.equals(videoCallParticipantView.A0N)) {
            VideoPort videoPort = this.A01;
            if (videoPort != null) {
                videoPort.setListener(null);
                this.A01 = null;
            }
            ImageView imageView = this.A00.A0J;
            if (imageView.getVisibility() == 0) {
                imageView.setImageBitmap(null);
                imageView.setVisibility(8);
            }
            this.A00.A0N = null;
            this.A00 = null;
        }
    }

    public final void A04() {
        if (this.A02) {
            CallInfo A0W = this.A04.A00.A0W();
            if (A0W == null) {
                AnonymousClass008.A1X(new StringBuilder(), this.A07, "startRenderingIfReady can not get callInfo");
                return;
            }
            AnonymousClass0QY infoByJid = A0W.getInfoByJid(this.A03);
            if (infoByJid == null) {
                AnonymousClass008.A1X(new StringBuilder(), this.A07, "startRenderingIfReady cancelled due to no participant info");
                return;
            }
            VideoCallParticipantView videoCallParticipantView = this.A00;
            if (videoCallParticipantView != null) {
                A08(videoCallParticipantView, infoByJid, A0W);
                if (!(this instanceof AnonymousClass3UN)) {
                    AnonymousClass3UM r4 = (AnonymousClass3UM) this;
                    UserJid userJid = r4.A03;
                    if (!r4.A09()) {
                        if (Voip.setVideoDisplayPort(userJid.getRawString(), r4.A01) == 0) {
                            Voip.startVideoRenderStream(userJid.getRawString());
                        } else {
                            AnonymousClass3U7 r2 = r4.A00.A0v;
                            if (r2 != null) {
                                r2.A0Q(22, null);
                            }
                        }
                    }
                } else {
                    AnonymousClass3UN r42 = (AnonymousClass3UN) this;
                    if (!infoByJid.A00() && !A0W.isCallOnHold()) {
                        r42.A00.A1L(r42, infoByJid);
                    }
                }
                A05(infoByJid);
                return;
            }
            throw null;
        }
    }

    public final void A05(AnonymousClass0QY r5) {
        VideoCallParticipantView videoCallParticipantView = this.A00;
        if (videoCallParticipantView == null) {
            AnonymousClass008.A1X(new StringBuilder(), this.A07, "updateLayoutParams cancelled due to no participant view");
            return;
        }
        if (r5 == null) {
            CallInfo A0W = this.A04.A00.A0W();
            if (A0W == null) {
                AnonymousClass008.A1X(new StringBuilder(), this.A07, "VideoParticipantPresenter can not get callInfo from voip");
                r5 = null;
            } else {
                r5 = A0W.getInfoByJid(this.A03);
            }
            if (r5 == null) {
                AnonymousClass008.A1X(new StringBuilder(), this.A07, "updateLayoutParams cancelled due to no participant info");
                return;
            }
        }
        Point A012 = A01(videoCallParticipantView, r5);
        if (A012 == null || A012.x == 0 || A012.y == 0) {
            AnonymousClass008.A1X(new StringBuilder(), this.A07, "updateLayoutParams cancelled due to bad video size");
        } else {
            this.A05.AQy(videoCallParticipantView, A012);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e5, code lost:
        if (r2 == 3) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0200, code lost:
        if (r2 == 3) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x025b, code lost:
        if (r2 == 3) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r2 == 3) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d5, code lost:
        if (r11.A0B == false) goto L_0x01d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass0QY r11, com.whatsapp.voipcalling.CallInfo r12) {
        /*
        // Method dump skipped, instructions count: 626
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39R.A06(X.0QY, com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A07(VideoCallParticipantView videoCallParticipantView) {
        if (videoCallParticipantView != this.A00 || !this.A03.equals(videoCallParticipantView.A0N)) {
            if (this.A00 != null) {
                A03();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.A07);
            sb.append("attachToParticipantView ");
            sb.append(videoCallParticipantView);
            sb.append(" for ");
            UserJid userJid = this.A03;
            AnonymousClass008.A1Q(sb, userJid);
            this.A00 = videoCallParticipantView;
            videoCallParticipantView.A0N = userJid;
            VideoPort A9h = this.A05.A9h(videoCallParticipantView);
            this.A01 = A9h;
            A9h.setListener(this.A06);
        }
    }

    public final void A08(VideoCallParticipantView videoCallParticipantView, AnonymousClass0QY r7, CallInfo callInfo) {
        if (!r7.A00() && !callInfo.self.A09 && !r7.A0G && r7.A04 != 2) {
            ImageView imageView = videoCallParticipantView.A0J;
            if (imageView.getVisibility() == 0) {
                imageView.setImageBitmap(null);
                imageView.setVisibility(8);
            }
        } else if (!C677039w.A00) {
            ImageView imageView2 = videoCallParticipantView.A0J;
            if (imageView2.getVisibility() != 0) {
                Bitmap A002 = A00();
                if (A002 == null) {
                    AnonymousClass008.A1X(new StringBuilder(), this.A07, "showLastFrameOverlay no bitmap");
                } else {
                    int width = A002.getWidth() / 40;
                    if (width < 8) {
                        width = 8;
                    } else if (width > 16) {
                        width = 16;
                    }
                    FilterUtils.blurNative(A002, width, 2);
                }
                imageView2.setImageBitmap(A002);
                imageView2.setVisibility(0);
            }
        }
    }
}
