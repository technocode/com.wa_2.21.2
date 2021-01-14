package X;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.StatusConfirmMuteDialogFragment;
import com.whatsapp.StatusConfirmUnmuteDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

/* renamed from: X.3Pf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71503Pf implements AbstractC13370k8 {
    public final /* synthetic */ StatusPlaybackBaseFragment A00;

    public /* synthetic */ C71503Pf(StatusPlaybackBaseFragment statusPlaybackBaseFragment) {
        this.A00 = statusPlaybackBaseFragment;
    }

    @Override // X.AbstractC13370k8
    public final boolean onMenuItemClick(MenuItem menuItem) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A00;
        if (statusPlaybackContactFragment.A0A() == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_conversations_unmute) {
            UserJid userJid = statusPlaybackContactFragment.A03;
            StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment = new StatusConfirmUnmuteDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("jid", userJid.getRawString());
            statusConfirmUnmuteDialogFragment.A0N(bundle);
            C008805h.A17(statusPlaybackContactFragment, statusConfirmUnmuteDialogFragment);
            return true;
        } else if (itemId != R.id.menuitem_conversations_mute) {
            return true;
        } else {
            UserJid userJid2 = statusPlaybackContactFragment.A03;
            StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment = new StatusConfirmMuteDialogFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("jid", userJid2.getRawString());
            statusConfirmMuteDialogFragment.A0N(bundle2);
            C008805h.A17(statusPlaybackContactFragment, statusConfirmMuteDialogFragment);
            return true;
        }
    }
}
