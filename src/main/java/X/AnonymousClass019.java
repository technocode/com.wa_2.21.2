package X;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.widget.ListView;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.Conversation;
import com.whatsapp.StatusesFragment;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.media.transcode.MediaTranscodeService;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.019  reason: invalid class name */
public abstract class AnonymousClass019 {
    public void A00(AbstractC007503q r13, int i) {
        AnonymousClass0M4 r1;
        View findViewWithTag;
        StickerView stickerView;
        int i2;
        AnonymousClass0M3 r132;
        AnonymousClass0M4 r12;
        int i3;
        byte b;
        if (this instanceof C71693Py) {
            C71693Py r3 = (C71693Py) this;
            if (r13 != null) {
                C007303n r2 = r13.A0n;
                C75033c0 r14 = r3.A00;
                if (r2.equals(((AbstractC74123aA) r14).A03.A0n) && r2.A02) {
                    r14.A0A.A02.post(new RunnableEBaseShape1S0201000_I1(r13, i, r3, 17));
                }
            }
        } else if (this instanceof C71673Pw) {
            C71673Pw r32 = (C71673Pw) this;
            if (r13 != null) {
                C007303n r22 = r13.A0n;
                C75023bz r15 = r32.A01;
                if (r22.equals(((AbstractC74123aA) r15).A03.A0n) && !r22.A02) {
                    r15.A0A.A02.post(new RunnableEBaseShape1S0201000_I1(r13, i, r32, 16));
                }
            }
        } else if (this instanceof C71563Pl) {
            StatusPlaybackContactFragment statusPlaybackContactFragment = ((C71563Pl) this).A00;
            if (!(statusPlaybackContactFragment.A06 == null || !AnonymousClass02Z.A02(statusPlaybackContactFragment.A03) || r13 == null)) {
                C007303n r4 = r13.A0n;
                if (AnonymousClass1VY.A0b(r4.A00) && r4.A02) {
                    AnonymousClass32Y A0t = statusPlaybackContactFragment.A0t();
                    A0t.A0C.A06.clear();
                    int i4 = 0;
                    for (AbstractC007503q r6 : statusPlaybackContactFragment.A06) {
                        if ((r6 instanceof AnonymousClass0M3) && (r1 = ((AnonymousClass0M3) r6).A02) != null && !r1.A0P && !r1.A0a) {
                            A0t.A0C.A06.add(Integer.valueOf(i4));
                        }
                        if (i4 == statusPlaybackContactFragment.A00 && r6.A0n.equals(r4)) {
                            statusPlaybackContactFragment.A11(r13);
                        }
                        i4++;
                    }
                }
            }
        } else if (this instanceof AnonymousClass3PM) {
            AnonymousClass3PM r23 = (AnonymousClass3PM) this;
            if (r13 != null) {
                C007303n r16 = r13.A0n;
                if (AnonymousClass1VY.A0b(r16.A00) && r16.A02) {
                    if (C12080hW.A00(r13.A08, 4) > 0) {
                        MyStatusesActivity.A04(r23.A00, r13, true);
                    } else {
                        r23.A00.A06.notifyDataSetChanged();
                    }
                }
            }
        } else if (this instanceof AnonymousClass0K9) {
            AnonymousClass0K9 r17 = (AnonymousClass0K9) this;
            if (r13 instanceof AnonymousClass0M3) {
                r17.A05(r13, i);
            }
        } else if (this instanceof C08600bP) {
            C08600bP r18 = (C08600bP) this;
            if (r13 instanceof AnonymousClass0MP) {
                r18.A00.A07.A07(r13);
            }
        } else if (this instanceof C58672mJ) {
            C58672mJ r24 = (C58672mJ) this;
            if (r13.A0m == 20) {
                PopupNotification popupNotification = r24.A00;
                if (popupNotification.A0W.contains(r13) && i == 3 && (findViewWithTag = popupNotification.A0Q.findViewWithTag(r13.A0n)) != null && (stickerView = (StickerView) findViewWithTag.findViewById(R.id.popup_sticker_view)) != null) {
                    popupNotification.A0Z((AnonymousClass0ZE) r13, stickerView);
                }
            }
        } else if (this instanceof C57052jc) {
            C57052jc r25 = (C57052jc) this;
            if (MediaTranscodeService.A08.containsKey(r13.A0n)) {
                r25.A00.A00();
            }
        } else if (this instanceof AnonymousClass280) {
            AnonymousClass280 r19 = (AnonymousClass280) this;
            if (r19.A03.A01()) {
                Log.d("InstrumentationObserverImpl/onMessageChanged");
                if (!(!r13.A0n.A02 || r13.A0g || r19.A02.A04())) {
                    for (AbstractC28671Vh r110 : r19.A04.A00()) {
                        if (r110 instanceof C446821b) {
                            ((C446821b) r110).A00.A02(0);
                        }
                    }
                }
            }
        } else if (this instanceof C54952fl) {
            C54952fl r26 = (C54952fl) this;
            if (r13 != null && r26.A01.equals(r13.A0n.A00) && AnonymousClass0FI.A0F(r13.A0m) && i == 3) {
                r26.A00.A00.A0o();
            } else if (r26.A04(r13)) {
                r26.A00.A00.A0o();
            }
        } else if (this instanceof C52272ar) {
            ConversationsFragment conversationsFragment = ((C52272ar) this).A00;
            if (conversationsFragment.A0g.A0D(AbstractC000400g.A2c) && i == 9) {
                AnonymousClass0AP r27 = conversationsFragment.A1M;
                AnonymousClass02N r111 = r13.A0n.A00;
                if (r27.A01(r111) == r13) {
                    ConversationsFragment.A02(conversationsFragment, r111);
                }
            }
        } else if (this instanceof C51942aK) {
            C51942aK r112 = (C51942aK) this;
            if (r13 != null && r13.A0j) {
                StarredMessagesActivity starredMessagesActivity = r112.A00;
                starredMessagesActivity.A0T().post(new RunnableEBaseShape7S0200000_I1_2(starredMessagesActivity, r13, 24));
            }
        } else if (this instanceof C51842a7) {
            MediaAlbumActivity mediaAlbumActivity = ((C51842a7) this).A00;
            AnonymousClass2Ib r0 = mediaAlbumActivity.A02;
            C007303n r28 = r13.A0n;
            if (r0.A00(r28)) {
                View findViewWithTag2 = mediaAlbumActivity.A0T().findViewWithTag(r28);
                if (findViewWithTag2 != null) {
                    AbstractC51572Zg r113 = (AbstractC51572Zg) findViewWithTag2;
                    if (r113.A0h(r28)) {
                        if (i == 8) {
                            if (r113.getFMessage() == r13) {
                                r113.A0O();
                                return;
                            }
                        } else if (i == 12 && r113.getFMessage() == r13) {
                            r113.A0L();
                            return;
                        }
                        r113.A0Z(r13, true);
                        return;
                    }
                    throw new IllegalStateException();
                }
                HashSet hashSet = mediaAlbumActivity.A0L;
                if (!hashSet.contains(r28)) {
                    hashSet.add(r28);
                }
            }
        } else if (this instanceof AnonymousClass2XG) {
            AnonymousClass2XG r02 = (AnonymousClass2XG) this;
            if (r13 != null) {
                ListChatInfo listChatInfo = r02.A00;
                if (listChatInfo.A0g().equals(r13.A0n.A00) && AnonymousClass0FI.A0F(r13.A0m) && i == 3) {
                    listChatInfo.A0k();
                }
            }
        } else if (this instanceof AnonymousClass2XB) {
            AnonymousClass2XB r03 = (AnonymousClass2XB) this;
            if (r13 != null) {
                ContactInfoActivity contactInfoActivity = r03.A00;
                if (contactInfoActivity.A0h().equals(r13.A0n.A00) && AnonymousClass0FI.A0F(r13.A0m) && i == 3) {
                    contactInfoActivity.A0j();
                }
            }
        } else if (this instanceof C09170cP) {
            C09170cP r29 = (C09170cP) this;
            if (i != 8) {
                C007303n r114 = r13.A0n;
                if (AnonymousClass1VY.A0b(r114.A00) && r114.A02) {
                    StatusesFragment statusesFragment = r29.A00;
                    if (statusesFragment.A05.A00 != null) {
                        C40791tq r04 = statusesFragment.A03;
                        if (r04 != null) {
                            ((AnonymousClass0JW) r04).A00.cancel(true);
                        }
                        C40791tq r210 = new C40791tq(statusesFragment);
                        statusesFragment.A03 = r210;
                        statusesFragment.A0s.ANC(r210, new Void[0]);
                    }
                }
            }
        } else if (this instanceof AnonymousClass1t3) {
            ((AnonymousClass1t3) this).A04(r13);
        } else if (this instanceof C04220Jn) {
            C04220Jn r42 = (C04220Jn) this;
            boolean z = false;
            switch (i) {
                case -1:
                case 24:
                    C007303n r33 = r13.A0n;
                    if (r33.A02 && (i3 = r13.A08) == 0) {
                        EnumC05410Ok r115 = r13.A0J;
                        if (r115 == EnumC05410Ok.RETRY) {
                            r13.A0J = EnumC05410Ok.NONE;
                            r42.A0X.A0E(r33.A01, 408);
                            return;
                        } else if (r115 != EnumC05410Ok.RELAY) {
                            r42.A0X.A0A(r33, i3);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 0:
                case 2:
                case 7:
                case 17:
                case AnonymousClass0PW.A01 /*{ENCODED_INT: 20}*/:
                case 22:
                default:
                    AnonymousClass008.A0w("app/messagechanged unknown type ", i);
                    return;
                case 1:
                case 4:
                    StringBuilder A0S = AnonymousClass008.A0S("app/msgchanged/locationormediaupload/send ");
                    C007303n r211 = r13.A0n;
                    AnonymousClass008.A1S(A0S, r211.A01);
                    byte b2 = r13.A0m;
                    if (AnonymousClass0FI.A0F(b2) || AnonymousClass0FI.A0H(b2)) {
                        C04340Jz r116 = r42.A0Q;
                        if (r116 != null) {
                            AnonymousClass02N r05 = r211.A00;
                            if (r05 != null) {
                                C50502Uy A01 = r116.A01(r05);
                                synchronized (A01) {
                                    if (!A01.A01.containsKey(r211)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("media-message-send-queue/ready-not-in-queue");
                                        sb.append(r211);
                                        sb.append(" ");
                                        sb.append(A01.toString());
                                        Log.d(sb.toString());
                                        C04340Jz r43 = A01.A02;
                                        AnonymousClass0FZ r212 = r43.A00;
                                        if (r212 != null) {
                                            r212.A02(r13, Collections.emptySet(), false, null);
                                            r43.A02.ANF(new RunnableEBaseShape8S0200000_I1_3(A01, r13, 31));
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("media-message-send-queue/ready ");
                                        sb2.append(r211);
                                        sb2.append(" ");
                                        sb2.append(A01.toString());
                                        Log.d(sb2.toString());
                                        A01.A00.add(r211);
                                        A01.A00();
                                    }
                                }
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    r42.A0S.A03(r13, false, null);
                    r42.A0d.ANF(new RunnableEBaseShape1S0200000_I0_0(r42, r13, 14));
                    return;
                case 3:
                    if ((r13 instanceof AnonymousClass0M3) && (r12 = (r132 = (AnonymousClass0M3) r13).A02) != null && r12.A0P) {
                        AnonymousClass02N r34 = r132.A0n.A00;
                        if (!AnonymousClass1VY.A0b(r34)) {
                            File file = r12.A0F;
                            if (file != null) {
                                C02220Bc r117 = r42.A0c;
                                if (r117 != null) {
                                    try {
                                        if (r117.A01.A0M(file)) {
                                            C02230Bd.A0R(r117.A06.A00, Uri.fromFile(file));
                                        }
                                    } catch (IOException e) {
                                        StringBuilder sb3 = new StringBuilder("mediafileurils/broadcastscanmediaintent/unable to scan file ");
                                        sb3.append(file);
                                        Log.e(sb3.toString(), e);
                                    }
                                } else {
                                    throw null;
                                }
                            }
                            if (((AnonymousClass1LF) Conversation.A4n.get()).A01(r34)) {
                                return;
                            }
                            if (r132.A0m == 2 && ((AbstractC007503q) r132).A04 == 1) {
                                AnonymousClass0FE r118 = r42.A0Y;
                                if (r132.A0P != null && r42.A00) {
                                    z = true;
                                }
                                r118.A09(r132, z, true);
                                if (r132.A0P != null) {
                                    r42.A00 = true;
                                    return;
                                }
                                return;
                            }
                            r42.A0Y.A0B(null, true, true, false, true, true);
                            return;
                        }
                        return;
                    }
                    return;
                case 5:
                    AnonymousClass0FE r35 = r42.A0Y;
                    r35.A02().post(new RunnableEBaseShape3S0200000_I0_2(r35, r13, 26));
                    r35.A09(r13, false, true);
                    if (r13 instanceof C02850Ds) {
                        C02850Ds r36 = (C02850Ds) r13;
                        r42.A0K.A0X(r36, r13.A0E + ((long) (r36.A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)));
                    }
                    if (r13.A09() instanceof AnonymousClass0ZE) {
                        r42.A05(r13);
                    }
                    if (r13 instanceof C12190hh) {
                        AnonymousClass08B r119 = r42.A09;
                        AnonymousClass02N r06 = r13.A0n.A00;
                        if (r06 != null) {
                            r119.A03(r06);
                            return;
                        }
                        throw null;
                    }
                    return;
                case 6:
                    AnonymousClass008.A1S(AnonymousClass008.A0S("app/msgchanged/futureproofreplaced "), r13.A0n.A01);
                    return;
                case 8:
                case 12:
                case 13:
                    return;
                case 9:
                case 10:
                    StringBuilder A0S2 = AnonymousClass008.A0S("app/msgchanged/edit ");
                    A0S2.append(r13.A0n);
                    Log.d(A0S2.toString());
                    return;
                case 11:
                    StringBuilder A0S3 = AnonymousClass008.A0S("mainmessageobserver/msgchanged/hsm-hydrate ");
                    A0S3.append(r13.A0n);
                    Log.d(A0S3.toString());
                    return;
                case 14:
                case 15:
                    AnonymousClass008.A1S(AnonymousClass008.A0S("app/msgchanged/paymentdecryptionfailed "), r13.A0n.A01);
                    return;
                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                    AnonymousClass008.A1S(AnonymousClass008.A0S("app/msgchanged/paymenttransactionstatusupdate "), r13.A0n.A01);
                    C02360Br r213 = r42.A0X;
                    C02400Bv r120 = r213.A0D;
                    if (r120.A03()) {
                        String A03 = r213.A0E.A03();
                        r213.A04.A00.A01(new SendWebForwardJob(A03, r120.A01().A03, Message.obtain(null, 0, 187, 0, new AnonymousClass22G(r13))));
                        return;
                    }
                    return;
                case 18:
                case 19:
                    if (AnonymousClass0FI.A0V(r13)) {
                        r42.A0V.A02(r13);
                    }
                    r42.A0E.A01(new RunnableEBaseShape1S0200000_I0_0(r42, r13, 16), 8);
                    return;
                case 21:
                    if (AnonymousClass0FI.A0V(r13)) {
                        r42.A0V.A02(r13);
                    }
                    r42.A0E.A01(new RunnableEBaseShape1S0200000_I0_0(r42, r13, 13), 9);
                    return;
                case 23:
                    C007303n r214 = r13.A0n;
                    if (r214.A02 && (i2 = r13.A08) == 7) {
                        r42.A0X.A0A(r214, i2);
                        return;
                    }
                    return;
            }
        } else if (this instanceof C40071sa) {
            C40071sa r121 = (C40071sa) this;
            if (i != 8 && AnonymousClass1VY.A0X(r13.A0n.A00)) {
                if (i == 3) {
                    ((ActivityC004702f) r121.A00).A0F.A02.postDelayed(new RunnableEBaseShape6S0100000_I1_1(r121, 9), 2000);
                    return;
                }
                r121.A00.A0T();
            }
        } else if (this instanceof C39651rs) {
            C39651rs r44 = (C39651rs) this;
            if (i == 9 && (r13 instanceof AnonymousClass0MM)) {
                Conversation conversation = r44.A00;
                conversation.A1O.add(Long.valueOf(r13.A0p));
                conversation.A0q.A0E = conversation.A1O;
            } else if (r13 == null) {
                return;
            }
            AnonymousClass02N r5 = r13.A0n.A00;
            Conversation conversation2 = r44.A00;
            if (r5.equals(conversation2.A14) && (b = r13.A0m) != 8) {
                RunnableEBaseShape0S0201000_I0 runnableEBaseShape0S0201000_I0 = new RunnableEBaseShape0S0201000_I0(conversation2, i, r13, 4);
                conversation2.A1G = runnableEBaseShape0S0201000_I0;
                conversation2.A0Y.post(runnableEBaseShape0S0201000_I0);
                if (i == 3) {
                    if (b == 1 && conversation2.A0Y.getLastVisiblePosition() >= conversation2.A0Y.getCount() - 2 && conversation2.A0Y.getChildCount() > 0) {
                        ListView listView = conversation2.A0Y;
                        if (r13.equals(listView.getChildAt(listView.getChildCount() - 1).getTag())) {
                            conversation2.A0s();
                        }
                    }
                } else if (i == 20) {
                    conversation2.A0q.A0H.clear();
                    conversation2.A0m();
                } else if (i == 24 && ((AnonymousClass1LF) Conversation.A4n.get()).A01(r5) && ((AnonymousClass2DW) conversation2).A0N.A00.getBoolean("conversation_sound", true) && (!AnonymousClass0FI.A0Y(r13))) {
                    C04260Jr r215 = conversation2.A4N;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("android.resource://com.whatsapp/");
                    sb4.append(R.raw.send_message);
                    r215.A02(Uri.parse(sb4.toString()));
                }
            }
        }
    }

    public void A01(Collection collection, AnonymousClass02N r19, Map map, boolean z) {
        AnonymousClass0M3 r0;
        if (this instanceof C71993Rc) {
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = ((C71993Rc) this).A00;
            C53852dw r7 = (C53852dw) ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A08;
            if (r7 != null && collection != null) {
                int count = r7.getCount();
                Iterator it = collection.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    AbstractC007503q r4 = (AbstractC007503q) it.next();
                    int i = 0;
                    while (true) {
                        if (i < count) {
                            AbstractC53892e0 r2 = (AbstractC53892e0) r7.A06.get(Integer.valueOf(i));
                            if (r2 != null && (r0 = r2.A00) != null && r0.A0n.equals(r4.A0n)) {
                                r2.A00.A0j = z;
                                z2 = true;
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
                if (z2) {
                    ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A06.A01.A00();
                }
            }
        } else if (this instanceof C08600bP) {
            ((C08600bP) this).A00.A0A.A07(collection);
        } else if (this instanceof C08750be) {
            AnonymousClass0Yj r5 = ((C08750be) this).A00.A05;
            C08590bO r42 = (C08590bO) r5.A01();
            if (r42 != null && collection != null) {
                if (z) {
                    r42.A03.removeAll(collection);
                    List list = r42.A02;
                    TreeSet treeSet = new TreeSet(C64182xl.A00);
                    treeSet.addAll(list);
                    treeSet.addAll(collection);
                    list.clear();
                    list.addAll(treeSet);
                } else {
                    r42.A02.removeAll(collection);
                    List list2 = r42.A03;
                    TreeSet treeSet2 = new TreeSet(C64182xl.A00);
                    treeSet2.addAll(list2);
                    treeSet2.addAll(collection);
                    list2.clear();
                    list2.addAll(treeSet2);
                }
                r5.A08(r42);
            }
        } else if (this instanceof C54952fl) {
            C54952fl r43 = (C54952fl) this;
            if (collection != null && !collection.isEmpty()) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (r43.A01.equals(((AbstractC007503q) it2.next()).A0n.A00)) {
                        r43.A00.A00.A0o();
                        return;
                    }
                }
            } else if (r19 == null || r43.A01.equals(r19)) {
                r43.A00.A00.A0o();
            }
        } else if (this instanceof C54422et) {
            C54422et r22 = (C54422et) this;
            if (collection != null) {
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    AbstractC007503q r3 = (AbstractC007503q) it3.next();
                    if (r3.A0m == 13 && z) {
                        AnonymousClass0M4 r1 = ((AnonymousClass0M3) r3).A02;
                        if (r1 != null && r1.A0O && !r1.A0a && r1.A0P) {
                            C03400Ga r12 = r22.A00;
                            r12.A0A.execute(new RunnableEBaseShape1S0200100_I1(r12, C49232Po.A00((AnonymousClass0ZB) r3), r12.A04.A05(), 1));
                        } else {
                            return;
                        }
                    }
                }
            }
        } else if (this instanceof C53772do) {
            MediaGalleryFragment mediaGalleryFragment = ((C53772do) this).A00;
            C53852dw r44 = (C53852dw) ((MediaGalleryFragmentBase) mediaGalleryFragment).A08;
            if (r44 == null) {
                return;
            }
            if (collection != null && !collection.isEmpty()) {
                Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    AnonymousClass02N r13 = ((AbstractC007503q) it4.next()).A0n.A00;
                    if (r13 != null && r13.equals(mediaGalleryFragment.A00)) {
                        r44.AMq();
                        ((MediaGalleryFragmentBase) mediaGalleryFragment).A06.A01.A00();
                        return;
                    }
                }
            } else if (r19 == null || r19.equals(mediaGalleryFragment.A00)) {
                r44.AMq();
                ((MediaGalleryFragmentBase) mediaGalleryFragment).A06.A01.A00();
            }
        } else if (this instanceof C53702dh) {
            C53702dh r45 = (C53702dh) this;
            if (collection != null && !collection.isEmpty()) {
                Iterator it5 = collection.iterator();
                while (it5.hasNext()) {
                    AnonymousClass02N r23 = ((AbstractC007503q) it5.next()).A0n.A00;
                    if (r23 != null) {
                        GalleryFragmentBase galleryFragmentBase = r45.A00;
                        if (r23.equals(galleryFragmentBase.A07)) {
                            galleryFragmentBase.A0p();
                            return;
                        }
                    }
                }
            } else if (r19 == null || r19.equals(r45.A00.A07)) {
                r45.A00.A0p();
            }
        } else if (this instanceof C51942aK) {
            C51942aK r14 = (C51942aK) this;
            if (collection != null) {
                if (collection.isEmpty()) {
                    return;
                }
            } else if (map != null) {
                return;
            }
            StarredMessagesActivity.A04(r14.A00);
        } else if (this instanceof C51842a7) {
            C51842a7 r52 = (C51842a7) this;
            if (collection != null) {
                boolean z3 = false;
                Iterator it6 = collection.iterator();
                while (it6.hasNext()) {
                    MediaAlbumActivity mediaAlbumActivity = r52.A00;
                    AnonymousClass2Ib r02 = mediaAlbumActivity.A02;
                    C007303n r15 = ((AbstractC007503q) it6.next()).A0n;
                    if (r02.A00(r15)) {
                        mediaAlbumActivity.A0M.add(r15);
                        z3 = true;
                    }
                }
                if (z3) {
                    r52.A00.A02.notifyDataSetChanged();
                }
            }
        } else if (this instanceof AnonymousClass2XG) {
            AnonymousClass2XG r46 = (AnonymousClass2XG) this;
            if (collection != null && !collection.isEmpty()) {
                Iterator it7 = collection.iterator();
                while (it7.hasNext()) {
                    ListChatInfo listChatInfo = r46.A00;
                    if (listChatInfo.A0g().equals(((AbstractC007503q) it7.next()).A0n.A00)) {
                        listChatInfo.A0k();
                        return;
                    }
                }
            } else if (r19 == null || r19.equals(r46.A00.A0g())) {
                r46.A00.A0k();
            }
        } else if (this instanceof AnonymousClass2XB) {
            AnonymousClass2XB r47 = (AnonymousClass2XB) this;
            if (collection != null && !collection.isEmpty()) {
                Iterator it8 = collection.iterator();
                while (it8.hasNext()) {
                    ContactInfoActivity contactInfoActivity = r47.A00;
                    if (contactInfoActivity.A0h().equals(((AbstractC007503q) it8.next()).A0n.A00)) {
                        contactInfoActivity.A0j();
                        return;
                    }
                }
            } else if (r19 == null || r47.A00.A0h().equals(r19)) {
                r47.A00.A0j();
            }
        } else if (this instanceof AnonymousClass1t3) {
            AnonymousClass1t3 r24 = (AnonymousClass1t3) this;
            Iterator it9 = collection.iterator();
            while (it9.hasNext()) {
                r24.A04((AbstractC007503q) it9.next());
            }
        } else if (this instanceof C04220Jn) {
            C04220Jn r72 = (C04220Jn) this;
            if (map != null) {
                HashMap hashMap = new HashMap();
                Iterator it10 = collection.iterator();
                while (it10.hasNext()) {
                    AbstractC007503q r25 = (AbstractC007503q) it10.next();
                    AnonymousClass02N r16 = r25.A0n.A00;
                    Collection collection2 = (Collection) hashMap.get(r16);
                    if (collection2 == null) {
                        collection2 = new ArrayList();
                        hashMap.put(r16, collection2);
                    }
                    collection2.add(r25);
                }
                r72.A0d.ANF(new RunnableEBaseShape0S0310000_I0(r72, hashMap, map, z, 0));
            }
        } else if (this instanceof C39651rs) {
            C39651rs r48 = (C39651rs) this;
            if (collection == null || collection.isEmpty()) {
                r48.A00.A0q.A01++;
            } else {
                Iterator it11 = collection.iterator();
                while (it11.hasNext()) {
                    r48.A00.A0q.A0P.add(((AbstractC007503q) it11.next()).A0n);
                }
            }
            r48.A00.A0l();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0450, code lost:
        if (r1 == null) goto L_0x0452;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.util.Collection r14, java.util.Map r15, java.util.Map r16) {
        /*
        // Method dump skipped, instructions count: 1634
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass019.A02(java.util.Collection, java.util.Map, java.util.Map):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f7, code lost:
        if (r4 != 0) goto L_0x00f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e4 A[Catch:{ StaleDataException -> 0x016d }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0169 A[Catch:{ StaleDataException -> 0x016d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AbstractC007503q r19, int r20) {
        /*
        // Method dump skipped, instructions count: 1247
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass019.A03(X.03q, int):void");
    }
}
