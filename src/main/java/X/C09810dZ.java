package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.0dZ  reason: invalid class name and case insensitive filesystem */
public class C09810dZ extends AnonymousClass0JW {
    public int A00;
    public final AnonymousClass01K A01 = AnonymousClass01K.A00();
    public final C03120Ew A02 = C03120Ew.A00();
    public final AnonymousClass09E A03 = AnonymousClass09E.A00();
    public final UserJid A04;
    public final C007303n A05;
    public final WeakReference A06;
    public final boolean A07;

    public C09810dZ(StatusPlaybackContactFragment statusPlaybackContactFragment, C007303n r3, boolean z, UserJid userJid) {
        this.A06 = new WeakReference(statusPlaybackContactFragment);
        this.A05 = r3;
        this.A07 = z;
        this.A04 = userJid;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        List list = (List) obj;
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A06.get();
        if (statusPlaybackContactFragment != null) {
            int i = this.A00;
            StringBuilder A0S = AnonymousClass008.A0S("playbackFragment/onMessagesLoaded ");
            A0S.append(list.size());
            A0S.append(" messages; ");
            A0S.append(statusPlaybackContactFragment);
            Log.i(A0S.toString());
            AnonymousClass32Y A0t = statusPlaybackContactFragment.A0t();
            statusPlaybackContactFragment.A06 = list;
            statusPlaybackContactFragment.A0z();
            if (!list.isEmpty()) {
                if (i < list.size()) {
                    statusPlaybackContactFragment.A00 = i;
                }
                AbstractC659532f A0x = statusPlaybackContactFragment.A0x((AbstractC007503q) list.get(statusPlaybackContactFragment.A00));
                A0t.A06.removeAllViews();
                A0t.A06.addView(A0x.A00);
                A0t.A01.setVisibility(8);
                if (((StatusPlaybackFragment) statusPlaybackContactFragment).A00) {
                    if (statusPlaybackContactFragment.A06 != null) {
                        int i2 = statusPlaybackContactFragment.A00;
                        statusPlaybackContactFragment.A00 = -1;
                        if (i2 == -1) {
                            i2 = 0;
                        }
                        statusPlaybackContactFragment.A10(i2);
                    }
                    statusPlaybackContactFragment.A12(statusPlaybackContactFragment.A0w(), 0, statusPlaybackContactFragment.A01);
                    return;
                }
                return;
            }
            AnonymousClass32Z r1 = (AnonymousClass32Z) statusPlaybackContactFragment.A0A();
            if (r1 != null) {
                r1.AGt(statusPlaybackContactFragment.A03.getRawString());
            }
        }
    }
}
