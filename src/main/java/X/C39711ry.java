package X;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.WaEditText;

/* renamed from: X.1ry  reason: invalid class name and case insensitive filesystem */
public class C39711ry implements AbstractC06100Rs {
    public final /* synthetic */ Conversation A00;

    @Override // X.AbstractC06100Rs
    public boolean ACa(AbstractC06110Rt r2, MenuItem menuItem) {
        return false;
    }

    @Override // X.AbstractC06100Rs
    public boolean AIh(AbstractC06110Rt r2, Menu menu) {
        return false;
    }

    public C39711ry(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AbstractC06100Rs
    public boolean AEi(AbstractC06110Rt r6, Menu menu) {
        Conversation conversation = this.A00;
        View inflate = LayoutInflater.from(conversation.A09().A01()).inflate(R.layout.conversation_search_view, (ViewGroup) null, false);
        r6.A02(inflate);
        WaEditText waEditText = (WaEditText) inflate.findViewById(R.id.search_src_text);
        conversation.A0m = waEditText;
        if (waEditText == null) {
            return false;
        }
        waEditText.setOnFocusChangeListener(new View$OnFocusChangeListenerC25591Ho(this));
        conversation.A0m.addTextChangedListener(conversation.A1r);
        conversation.A0m.setOnEditorActionListener(new C25581Hn(this));
        View A0D = AnonymousClass0Q7.A0D(inflate, R.id.search_up);
        conversation.A0L = A0D;
        A0D.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 13));
        View A0D2 = AnonymousClass0Q7.A0D(inflate, R.id.search_down);
        conversation.A0J = A0D2;
        A0D2.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 14));
        conversation.A0M = AnonymousClass0Q7.A0D(inflate, R.id.search_up_progress_bar);
        conversation.A0K = AnonymousClass0Q7.A0D(inflate, R.id.search_down_progress_bar);
        conversation.A0m.setText(conversation.A1K);
        conversation.A0m.selectAll();
        conversation.A0m.requestFocus();
        conversation.A0m.setSelected(true);
        return true;
    }

    @Override // X.AbstractC06100Rs
    public void AEx(AbstractC06110Rt r4) {
        r4.A02(null);
        Conversation conversation = this.A00;
        conversation.A0f = null;
        conversation.A1J = null;
        conversation.A1N = null;
        conversation.A0y = null;
        if (AnonymousClass1VY.A0a(conversation.A0z.A09) || conversation.A1I()) {
            conversation.A0k.A00();
        } else {
            conversation.A0E.setVisibility(0);
            conversation.A0k.requestFocus();
        }
        conversation.A0q.A01++;
        conversation.A0m();
    }
}
