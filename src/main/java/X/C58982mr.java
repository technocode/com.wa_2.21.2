package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.util.Log;

/* renamed from: X.2mr  reason: invalid class name and case insensitive filesystem */
public class C58982mr extends AnonymousClass2Z9 {
    public C58982mr(ActivityC004802g r1, AbstractC004502c r2, AbstractC03780Hp r3, AnonymousClass02M r4, AnonymousClass01I r5, AnonymousClass00T r6, C006903j r7, AnonymousClass325 r8, C000300f r9, C04360Kb r10, AnonymousClass0Fh r11, AnonymousClass01X r12, AnonymousClass1PN r13, AnonymousClass0AS r14, AnonymousClass08B r15, AnonymousClass31y r16, AnonymousClass0BB r17, AnonymousClass00C r18, AnonymousClass0HI r19, AnonymousClass0CG r20, C47242Ha r21, AnonymousClass0AQ r22, AnonymousClass0OP r23, C007003k r24) {
        super(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    @Override // X.AnonymousClass1PE
    public void AEm(Menu menu) {
        Log.i("listconversationmenu/oncreateoptionsmenu");
        AnonymousClass01X r4 = this.A0F;
        menu.add(0, 21, 0, r4.A06(R.string.list_info));
        menu.add(0, 6, 0, r4.A06(R.string.view_list_media));
        menu.add(0, 7, 0, r4.A06(R.string.search));
        menu.add(0, 5, 0, r4.A06(R.string.wallpaper));
        SubMenu A01 = A01(menu);
        A01.add(0, 8, 0, r4.A06(R.string.clear_chat));
        A02(A01);
        A01.add(0, 2, 0, r4.A06(R.string.add_shortcut_short));
    }

    @Override // X.AnonymousClass2Z9, X.AnonymousClass1PE
    public boolean AI8(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 21) {
            C007003k r4 = this.A00;
            ActivityC004802g r3 = this.A02;
            ListChatInfo.A04(r4, r3, AnonymousClass2UT.A01(r3, r3.findViewById(R.id.transition_start), this.A09.A01(R.string.transition_photo)));
            return true;
        } else if (itemId != 22) {
            return super.AI8(menuItem);
        } else {
            return true;
        }
    }

    @Override // X.AnonymousClass2Z9, X.AnonymousClass1PE
    public boolean AIi(Menu menu) {
        StringBuilder A0S = AnonymousClass008.A0S("listconversationmenu/onprepareoptionsmenu ");
        A0S.append(menu.size());
        Log.i(A0S.toString());
        if (menu.size() == 0) {
            return false;
        }
        super.AIi(menu);
        return true;
    }
}
