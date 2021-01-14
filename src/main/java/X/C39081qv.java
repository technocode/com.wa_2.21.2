package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.ListFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.StatusesFragment;

/* renamed from: X.1qv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C39081qv implements AnonymousClass0SG {
    public final /* synthetic */ StatusesFragment A00;

    public /* synthetic */ C39081qv(StatusesFragment statusesFragment) {
        this.A00 = statusesFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        StatusesFragment statusesFragment = this.A00;
        if (!((Boolean) obj).booleanValue()) {
            if (statusesFragment.A02 == null) {
                statusesFragment.A0n();
                ListView listView = ((ListFragment) statusesFragment).A04;
                ActivityC004902h A0A = statusesFragment.A0A();
                if (A0A != null) {
                    View inflate = A0A.getLayoutInflater().inflate(R.layout.status_education_row, (ViewGroup) listView, false);
                    statusesFragment.A02 = inflate;
                    ((TextView) inflate.findViewById(R.id.text)).setText(statusesFragment.A0e.A0D(R.string.status_education_with_placeholder, 24));
                    statusesFragment.A02.findViewById(R.id.cancel).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(statusesFragment, 41));
                    statusesFragment.A02.findViewById(R.id.privacy_settings).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(statusesFragment, 43));
                    Context A002 = statusesFragment.A00();
                    if (A002 != null) {
                        FrameLayout frameLayout = new FrameLayout(A002);
                        frameLayout.addView(statusesFragment.A02);
                        listView.addHeaderView(frameLayout, null, true);
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            statusesFragment.A02.setVisibility(0);
        }
    }
}
