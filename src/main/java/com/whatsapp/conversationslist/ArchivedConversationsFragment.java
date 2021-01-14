package com.whatsapp.conversationslist;

import X.AbstractC000400g;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass01Q;
import X.C000300f;
import X.C002301g;
import X.C008805h;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.ListFragment;
import com.google.android.search.verification.client.R;

public class ArchivedConversationsFragment extends ConversationsFragment {
    public AnimatorSet A00;
    public View A01;
    public View A02;
    public final C000300f A03 = C000300f.A00();
    public final AnonymousClass01Q A04 = AnonymousClass01Q.A00();

    @Override // com.whatsapp.conversationslist.ConversationsFragment, X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass00D r3 = this.A18;
        AnonymousClass008.A0k(r3, "archive_nux_shown_count", r3.A00.getInt("archive_nux_shown_count", 0) + 1);
        return super.A0Z(layoutInflater, viewGroup, bundle);
    }

    @Override // com.whatsapp.conversationslist.ConversationsFragment, X.AnonymousClass037
    public void A0k(Menu menu, MenuInflater menuInflater) {
        if (this.A03.A0D(AbstractC000400g.A0p)) {
            menu.add(1, R.id.menuitem_archive_chat_notifications, 0, R.string.archive_settings);
        } else {
            super.A0k(menu, menuInflater);
        }
    }

    @Override // com.whatsapp.conversationslist.ConversationsFragment, X.AnonymousClass037
    public boolean A0m(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_archive_chat_notifications) {
            return super.A0m(menuItem);
        }
        ActivityC004902h A0A = A0A();
        if (A0A == null) {
            return true;
        }
        A0h(new Intent(A0A, ArchiveNotificationSettingActivity.class));
        return true;
    }

    public final View A14(int i) {
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            LayoutInflater layoutInflater = A0A.getLayoutInflater();
            A0n();
            View inflate = layoutInflater.inflate(i, (ViewGroup) ((ListFragment) this).A04, false);
            Context A002 = A00();
            if (A002 != null) {
                FrameLayout frameLayout = new FrameLayout(A002);
                frameLayout.addView(inflate);
                A0n();
                ((ListFragment) this).A04.addHeaderView(frameLayout, null, false);
                return inflate;
            }
            throw null;
        }
        throw null;
    }

    public final void A15(boolean z) {
        if (this.A02 == null) {
            View A14 = A14(R.layout.read_later_mute_detail_header);
            this.A02 = A14;
            C002301g.A03((TextView) A14.findViewById(R.id.reader_later_header_title));
        }
        if (z) {
            C008805h.A06(this.A02, C008805h.A02(A01(), 40.0f), null, 500).start();
        } else {
            this.A02.setVisibility(0);
        }
    }
}
