package X;

import android.content.Intent;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.util.Log;

/* renamed from: X.27J  reason: invalid class name */
public class AnonymousClass27J extends AbstractC51922aG {
    public final /* synthetic */ Conversation A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass27J(Conversation conversation, ActivityC004802g r29, AnonymousClass02M r30, AnonymousClass0Z6 r31, AnonymousClass320 r32, AnonymousClass01I r33, AnonymousClass00T r34, AnonymousClass325 r35, AnonymousClass00Y r36, C000300f r37, AnonymousClass0DH r38, C04360Kb r39, AbstractC658531u r40, C02780Dk r41, AnonymousClass01A r42, AnonymousClass03P r43, C014308b r44, AnonymousClass01X r45, AnonymousClass0EO r46, AnonymousClass31y r47, AnonymousClass322 r48, AnonymousClass0CG r49, AnonymousClass0CH r50, C04420Kh r51, AnonymousClass01T r52, AnonymousClass022 r53) {
        super(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53);
        this.A00 = conversation;
    }

    public final void A04(AbstractC007503q r5) {
        Conversation.A4m.put(r5.A07(), r5);
        Conversation conversation = this.A00;
        Intent intent = new Intent(conversation, Conversation.class);
        intent.putExtra("jid", AnonymousClass1VY.A0D(r5.A07()));
        conversation.startActivity(intent);
        conversation.finish();
    }

    @Override // X.AbstractC06100Rs, X.AbstractC51922aG
    public boolean ACa(AbstractC06110Rt r5, MenuItem menuItem) {
        Conversation conversation = this.A00;
        C47612Is r0 = ((AnonymousClass2DW) conversation).A03;
        if (r0 == null || r0.size() == 0) {
            return true;
        }
        if (menuItem.getItemId() == R.id.menuitem_add_to_contacts || menuItem.getItemId() == R.id.menuitem_message_contact) {
            boolean A1L = conversation.A1L(menuItem.getItemId(), AnonymousClass0EO.A01(A01()));
            A03();
            return A1L;
        } else if (menuItem.getItemId() == R.id.menuitem_reply) {
            AbstractC007503q A01 = A01();
            if (conversation.A1I()) {
                A04(A01);
            } else {
                conversation.A1D(A01, true);
            }
            A03();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_reply_privately) {
            return super.ACa(r5, menuItem);
        } else {
            A04(A01());
            A03();
            return true;
        }
    }

    @Override // X.AbstractC06100Rs
    public void AEx(AbstractC06110Rt r4) {
        Log.i("conversation/selectionended");
        Conversation conversation = this.A00;
        C47612Is r0 = ((AnonymousClass2DW) conversation).A03;
        if (r0 != null) {
            r0.A00();
            ((AnonymousClass2DW) conversation).A03 = null;
        }
        conversation.A0m();
        ((AnonymousClass2DW) conversation).A00 = null;
        conversation.A0q.A07 = null;
        if (conversation.A17 == null) {
            conversation.A0v();
        }
    }
}
