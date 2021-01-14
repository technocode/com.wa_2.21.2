package X;

import android.content.Intent;
import com.whatsapp.AcceptInviteLinkActivity;
import com.whatsapp.HomeActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.group.NewGroup;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.0A8  reason: invalid class name */
public class AnonymousClass0A8 extends AnonymousClass01G {
    public static final AnonymousClass0A8 A00 = new AnonymousClass0A8();

    public void A02() {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    AnonymousClass0BR r3 = (AnonymousClass0BR) r1.next();
                    if (r3 instanceof AnonymousClass0BQ) {
                        ((AnonymousClass0BQ) r3).A00.A0D();
                    } else if (r3 instanceof C71073Nm) {
                        SearchFragment searchFragment = ((C71073Nm) r3).A00;
                        AnonymousClass02M r2 = searchFragment.A0N;
                        r2.A02.post(new RunnableEBaseShape12S0100000_I1_7(searchFragment, 33));
                    } else if (r3 instanceof C55502ge) {
                        C55502ge r32 = (C55502ge) r3;
                        Log.i("ViewGroupInviteActivity/onConversationsListChanged");
                        ViewGroupInviteActivity viewGroupInviteActivity = r32.A00;
                        if (viewGroupInviteActivity.A09 != null) {
                            AnonymousClass02M r22 = ((ActivityC004702f) viewGroupInviteActivity).A0F;
                            r22.A02.post(new RunnableEBaseShape10S0100000_I1_5(r32, 34));
                        }
                    } else if (r3 instanceof C55062fw) {
                        C55062fw r33 = (C55062fw) r3;
                        Log.i("newgroup/onConversationsListChanged");
                        NewGroup newGroup = r33.A00;
                        if (newGroup.A0c.get() != null) {
                            AnonymousClass02M r23 = ((ActivityC004702f) newGroup).A0F;
                            r23.A02.post(new RunnableEBaseShape10S0100000_I1_5(r33, 13));
                        }
                    } else if (r3 instanceof C52282as) {
                        ConversationsFragment conversationsFragment = ((C52282as) r3).A00;
                        AnonymousClass02M r24 = conversationsFragment.A0d;
                        r24.A02.post(new RunnableEBaseShape9S0100000_I1_4(conversationsFragment, 21));
                    } else if (r3 instanceof AnonymousClass0Yn) {
                        HomeActivity homeActivity = ((AnonymousClass0Yn) r3).A00;
                        AnonymousClass02M r25 = ((ActivityC004702f) homeActivity).A0F;
                        r25.A02.post(new RunnableEBaseShape1S0100000_I0_1(homeActivity, 8));
                    } else if (r3 instanceof C08820bm) {
                        C08820bm r34 = (C08820bm) r3;
                        Log.i("acceptlink/onConversationsListChanged");
                        AcceptInviteLinkActivity acceptInviteLinkActivity = r34.A00;
                        if (acceptInviteLinkActivity.A02 != null) {
                            AnonymousClass02M r26 = ((ActivityC004702f) acceptInviteLinkActivity).A0F;
                            r26.A02.post(new RunnableEBaseShape0S0100000_I0_0(r34, 32));
                        }
                    }
                }
            }
        }
    }

    public void A03(int i) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    AnonymousClass0BR r12 = (AnonymousClass0BR) r1.next();
                    if (r12 instanceof C52282as) {
                        ((C52282as) r12).A00.A11(i);
                    }
                }
            }
        }
    }

    public void A04(AnonymousClass02N r5) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    AnonymousClass0BR r12 = (AnonymousClass0BR) r1.next();
                    if (r12 instanceof C55062fw) {
                        Log.i("newgroup/onConversationAdded");
                        NewGroup newGroup = ((C55062fw) r12).A00;
                        AnonymousClass02R r0 = newGroup.A05;
                        if (r0 != null && r0.A00.equals(r5)) {
                            Log.i("newgroup/onConversationAdded/processing runAfterTempConversationAddedToDb");
                            ((Runnable) newGroup.A05.A01).run();
                            newGroup.A05 = null;
                        }
                    }
                }
            }
        }
    }

    public void A05(AnonymousClass02N r8) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    AnonymousClass0BR r5 = (AnonymousClass0BR) r1.next();
                    if (r5 instanceof AnonymousClass0BQ) {
                        ((AnonymousClass0BQ) r5).A00.A0D();
                    } else if (r5 instanceof C71073Nm) {
                        SearchFragment.A00(((C71073Nm) r5).A00, r8);
                    } else if (r5 instanceof C55502ge) {
                        C55502ge r52 = (C55502ge) r5;
                        AnonymousClass008.A12("ViewGroupInviteActivity/onConversationChanged/", r8);
                        ViewGroupInviteActivity viewGroupInviteActivity = r52.A00;
                        AnonymousClass02U r0 = viewGroupInviteActivity.A09;
                        if (r0 != null && r0.equals(r8)) {
                            AnonymousClass02M r2 = ((ActivityC004702f) viewGroupInviteActivity).A0F;
                            r2.A02.post(new RunnableEBaseShape10S0100000_I1_5(r52, 33));
                        }
                    } else if (r5 instanceof C55062fw) {
                        C55062fw r53 = (C55062fw) r5;
                        AnonymousClass008.A12("newgroup/onConversationChanged/", r8);
                        NewGroup newGroup = r53.A00;
                        Object obj = newGroup.A0c.get();
                        if (obj != null && obj.equals(r8)) {
                            AnonymousClass02M r22 = ((ActivityC004702f) newGroup).A0F;
                            r22.A02.post(new RunnableEBaseShape8S0200000_I1_3(r53, obj, 13));
                        }
                    } else if (r5 instanceof C54922fi) {
                        C54922fi r54 = (C54922fi) r5;
                        if (r8 != null) {
                            GroupChatInfo groupChatInfo = r54.A00;
                            if (r8.equals(groupChatInfo.A0S)) {
                                AnonymousClass02M r23 = groupChatInfo.A0Z;
                                r23.A02.post(new RunnableEBaseShape10S0100000_I1_5(groupChatInfo, 4));
                            }
                        }
                    } else if (r5 instanceof C52282as) {
                        ConversationsFragment conversationsFragment = ((C52282as) r5).A00;
                        AnonymousClass02M r24 = conversationsFragment.A0d;
                        r24.A02.post(new RunnableEBaseShape9S0100000_I1_4(conversationsFragment, 20));
                    } else if (r5 instanceof AnonymousClass2X9) {
                        ContactInfoActivity contactInfoActivity = ((AnonymousClass2X9) r5).A00;
                        if (!(contactInfoActivity.A0G == null || r8 == null || !r8.equals(contactInfoActivity.A0h()))) {
                            AnonymousClass02M r25 = ((ActivityC004702f) contactInfoActivity).A0F;
                            r25.A02.post(new RunnableEBaseShape8S0100000_I1_3(contactInfoActivity, 15));
                        }
                    } else if (r5 instanceof AnonymousClass0Yn) {
                        HomeActivity homeActivity = ((AnonymousClass0Yn) r5).A00;
                        AnonymousClass02M r26 = ((ActivityC004702f) homeActivity).A0F;
                        r26.A02.post(new RunnableEBaseShape1S0100000_I0_1(homeActivity, 7));
                    } else if (r5 instanceof C08820bm) {
                        C08820bm r55 = (C08820bm) r5;
                        AnonymousClass008.A12("acceptlink/onConversationChanged/", r8);
                        AcceptInviteLinkActivity acceptInviteLinkActivity = r55.A00;
                        AnonymousClass02U r02 = acceptInviteLinkActivity.A02;
                        if (r02 != null && r02.equals(r8)) {
                            AnonymousClass02M r27 = ((ActivityC004702f) acceptInviteLinkActivity).A0F;
                            r27.A02.post(new RunnableEBaseShape0S0100000_I0_0(r55, 31));
                        }
                    }
                }
            }
        }
    }

    public void A06(AnonymousClass02N r7) {
        if (r7 != null) {
            synchronized (this.A00) {
                Iterator it = this.A00.iterator();
                while (true) {
                    AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                    if (r1.hasNext()) {
                        AnonymousClass0BR r4 = (AnonymousClass0BR) r1.next();
                        if (r4 instanceof C71073Nm) {
                            SearchViewModel searchViewModel = ((C71073Nm) r4).A00.A0B;
                            C08670bW r0 = searchViewModel.A0k;
                            r0.A02.A08(r0.A00);
                            C08720bb r02 = searchViewModel.A0l;
                            r02.A02.A08(r02.A00);
                        } else if (r4 instanceof C54922fi) {
                            GroupChatInfo groupChatInfo = ((C54922fi) r4).A00;
                            if (r7.equals(groupChatInfo.A0S)) {
                                groupChatInfo.A0h();
                            }
                        } else if (r4 instanceof AnonymousClass2X9) {
                            ContactInfoActivity contactInfoActivity = ((AnonymousClass2X9) r4).A00;
                            if (r7.equals(contactInfoActivity.A0h()) && !(!((ActivityC004702f) contactInfoActivity).A0B)) {
                                contactInfoActivity.startActivity(new Intent(contactInfoActivity.getApplicationContext(), HomeActivity.class).addFlags(603979776));
                            }
                        } else if (r4 instanceof AnonymousClass0PH) {
                            AnonymousClass0PH r42 = (AnonymousClass0PH) r4;
                            r42.A01.ANF(new RunnableEBaseShape1S0200000_I0_0(r42, r7, 45));
                        } else if (r4 instanceof C39991sR) {
                            ((C39991sR) r4).A00.A04(r7);
                        }
                    }
                }
            }
            return;
        }
        throw null;
    }

    public void A07(AnonymousClass02N r7, boolean z) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    AnonymousClass0BR r3 = (AnonymousClass0BR) r1.next();
                    if (r3 instanceof C52282as) {
                        C52282as r32 = (C52282as) r3;
                        AnonymousClass02M r2 = r32.A00.A0d;
                        r2.A02.post(new RunnableEBaseShape1S0210000_I1(r32, r7, z, 3));
                    }
                }
            }
        }
    }
}
