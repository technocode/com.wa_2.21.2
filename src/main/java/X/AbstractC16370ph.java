package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0ph  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC16370ph {
    public long A00 = 120;
    public long A01 = 250;
    public long A02 = 250;
    public long A03 = 120;
    public AbstractC16350pf A04 = null;
    public ArrayList A05 = new ArrayList();

    public static C16360pg A00(AbstractC11910hD r3) {
        C16360pg r2 = new C16360pg();
        View view = r3.A0H;
        r2.A00 = view.getLeft();
        r2.A01 = view.getTop();
        view.getRight();
        view.getBottom();
        return r2;
    }

    public static void A01(AbstractC11910hD r2) {
        int i = r2.A00 & 14;
        if (!r2.A08() && (i & 4) == 0) {
            r2.A00();
        }
    }

    public void A02() {
        if (!(this instanceof C58912mk)) {
            AnonymousClass240 r5 = (AnonymousClass240) this;
            ArrayList arrayList = r5.A08;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C16010p6 r1 = (C16010p6) arrayList.get(size);
                View view = r1.A04.A0H;
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                r5.A05(r1.A04);
                arrayList = r5.A08;
                arrayList.remove(size);
            }
            ArrayList arrayList2 = r5.A09;
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                r5.A05((AbstractC11910hD) arrayList2.get(size2));
                arrayList2 = r5.A09;
                arrayList2.remove(size2);
            }
            ArrayList arrayList3 = r5.A06;
            int size3 = arrayList3.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    break;
                }
                AbstractC11910hD r12 = (AbstractC11910hD) arrayList3.get(size3);
                r12.A0H.setAlpha(1.0f);
                r5.A05(r12);
                arrayList3 = r5.A06;
                arrayList3.remove(size3);
            }
            int size4 = r5.A07.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                C16000p5 r13 = (C16000p5) r5.A07.get(size4);
                AbstractC11910hD r0 = r13.A05;
                if (r0 != null) {
                    r5.A0D(r13, r0);
                }
                AbstractC11910hD r02 = r13.A04;
                if (r02 != null) {
                    r5.A0D(r13, r02);
                }
            }
            r5.A07.clear();
            if (r5.A06()) {
                int size5 = r5.A05.size();
                while (true) {
                    size5--;
                    if (size5 < 0) {
                        break;
                    }
                    AbstractList abstractList = (AbstractList) r5.A05.get(size5);
                    int size6 = abstractList.size();
                    while (true) {
                        size6--;
                        if (size6 >= 0) {
                            C16010p6 r14 = (C16010p6) abstractList.get(size6);
                            View view2 = r14.A04.A0H;
                            view2.setTranslationY(0.0f);
                            view2.setTranslationX(0.0f);
                            r5.A05(r14.A04);
                            abstractList.remove(size6);
                            if (abstractList.isEmpty()) {
                                r5.A05.remove(abstractList);
                            }
                        }
                    }
                }
                int size7 = r5.A01.size();
                while (true) {
                    size7--;
                    if (size7 < 0) {
                        break;
                    }
                    AbstractList abstractList2 = (AbstractList) r5.A01.get(size7);
                    int size8 = abstractList2.size();
                    while (true) {
                        size8--;
                        if (size8 >= 0) {
                            AbstractC11910hD r15 = (AbstractC11910hD) abstractList2.get(size8);
                            r15.A0H.setAlpha(1.0f);
                            r5.A05(r15);
                            abstractList2.remove(size8);
                            if (abstractList2.isEmpty()) {
                                r5.A01.remove(abstractList2);
                            }
                        }
                    }
                }
                int size9 = r5.A03.size();
                while (true) {
                    size9--;
                    if (size9 >= 0) {
                        AbstractList abstractList3 = (AbstractList) r5.A03.get(size9);
                        int size10 = abstractList3.size();
                        while (true) {
                            size10--;
                            if (size10 >= 0) {
                                C16000p5 r16 = (C16000p5) abstractList3.get(size10);
                                AbstractC11910hD r03 = r16.A05;
                                if (r03 != null) {
                                    r5.A0D(r16, r03);
                                }
                                AbstractC11910hD r04 = r16.A04;
                                if (r04 != null) {
                                    r5.A0D(r16, r04);
                                }
                                if (abstractList3.isEmpty()) {
                                    r5.A03.remove(abstractList3);
                                }
                            }
                        }
                    } else {
                        AnonymousClass240.A02(r5.A0A);
                        AnonymousClass240.A02(r5.A04);
                        AnonymousClass240.A02(r5.A00);
                        AnonymousClass240.A02(r5.A02);
                        r5.A03();
                        return;
                    }
                }
            }
        } else {
            C58912mk r52 = (C58912mk) this;
            int size11 = r52.A08.size();
            while (true) {
                size11--;
                if (size11 < 0) {
                    break;
                }
                C47042Gf r17 = (C47042Gf) r52.A08.get(size11);
                View view3 = r17.A04.A0H;
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                r52.A05(r17.A04);
                r52.A08.remove(size11);
            }
            int size12 = r52.A09.size();
            while (true) {
                size12--;
                if (size12 < 0) {
                    break;
                }
                r52.A05((AbstractC11910hD) r52.A09.get(size12));
                r52.A09.remove(size12);
            }
            int size13 = r52.A06.size();
            while (true) {
                size13--;
                if (size13 < 0) {
                    break;
                }
                AbstractC11910hD r18 = (AbstractC11910hD) r52.A06.get(size13);
                View view4 = r18.A0H;
                view4.setScaleX(1.0f);
                view4.setScaleY(1.0f);
                r52.A05(r18);
                r52.A06.remove(size13);
            }
            int size14 = r52.A07.size();
            while (true) {
                size14--;
                if (size14 < 0) {
                    break;
                }
                C47032Ge r19 = (C47032Ge) r52.A07.get(size14);
                AbstractC11910hD r05 = r19.A05;
                if (r05 != null) {
                    r52.A0C(r19, r05);
                }
                AbstractC11910hD r06 = r19.A04;
                if (r06 != null) {
                    r52.A0C(r19, r06);
                }
            }
            r52.A07.clear();
            if (r52.A06()) {
                int size15 = r52.A05.size();
                while (true) {
                    size15--;
                    if (size15 < 0) {
                        break;
                    }
                    List list = (List) r52.A05.get(size15);
                    int size16 = list.size();
                    while (true) {
                        size16--;
                        if (size16 >= 0) {
                            C47042Gf r110 = (C47042Gf) list.get(size16);
                            View view5 = r110.A04.A0H;
                            view5.setTranslationY(0.0f);
                            view5.setTranslationX(0.0f);
                            r52.A05(r110.A04);
                            list.remove(size16);
                            if (list.isEmpty()) {
                                r52.A05.remove(list);
                            }
                        }
                    }
                }
                int size17 = r52.A01.size();
                while (true) {
                    size17--;
                    if (size17 < 0) {
                        break;
                    }
                    List list2 = (List) r52.A01.get(size17);
                    int size18 = list2.size();
                    while (true) {
                        size18--;
                        if (size18 >= 0) {
                            AbstractC11910hD r111 = (AbstractC11910hD) list2.get(size18);
                            View view6 = r111.A0H;
                            view6.setScaleX(1.0f);
                            view6.setScaleY(1.0f);
                            r52.A05(r111);
                            list2.remove(size18);
                            if (list2.isEmpty()) {
                                r52.A01.remove(list2);
                            }
                        }
                    }
                }
                int size19 = r52.A03.size();
                while (true) {
                    size19--;
                    if (size19 >= 0) {
                        List list3 = (List) r52.A03.get(size19);
                        int size20 = list3.size();
                        while (true) {
                            size20--;
                            if (size20 >= 0) {
                                C47032Ge r112 = (C47032Ge) list3.get(size20);
                                AbstractC11910hD r07 = r112.A05;
                                if (r07 != null) {
                                    r52.A0C(r112, r07);
                                }
                                AbstractC11910hD r08 = r112.A04;
                                if (r08 != null) {
                                    r52.A0C(r112, r08);
                                }
                                if (list3.isEmpty()) {
                                    r52.A03.remove(list3);
                                }
                            }
                        }
                    } else {
                        C58912mk.A02(r52.A0A);
                        C58912mk.A02(r52.A04);
                        C58912mk.A02(r52.A00);
                        C58912mk.A02(r52.A02);
                        r52.A03();
                        return;
                    }
                }
            }
        }
    }

    public final void A03() {
        ArrayList arrayList = this.A05;
        if (0 < arrayList.size()) {
            arrayList.get(0);
            throw null;
        } else {
            arrayList.clear();
        }
    }

    public void A04(AbstractC11910hD r9) {
        if (!(this instanceof C58912mk)) {
            AnonymousClass240 r3 = (AnonymousClass240) this;
            View view = r9.A0H;
            view.animate().cancel();
            ArrayList arrayList = r3.A08;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (((C16010p6) arrayList.get(size)).A04 == r9) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    r3.A05(r9);
                    arrayList = r3.A08;
                    arrayList.remove(size);
                }
            }
            r3.A0C(r3.A07, r9);
            if (r3.A09.remove(r9)) {
                view.setAlpha(1.0f);
                r3.A05(r9);
            }
            if (r3.A06.remove(r9)) {
                view.setAlpha(1.0f);
                r3.A05(r9);
            }
            int size2 = r3.A03.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                ArrayList arrayList2 = (ArrayList) r3.A03.get(size2);
                r3.A0C(arrayList2, r9);
                if (arrayList2.isEmpty()) {
                    r3.A03.remove(size2);
                }
            }
            int size3 = r3.A05.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    break;
                }
                AbstractList abstractList = (AbstractList) r3.A05.get(size3);
                int size4 = abstractList.size();
                while (true) {
                    size4--;
                    if (size4 < 0) {
                        break;
                    } else if (((C16010p6) abstractList.get(size4)).A04 == r9) {
                        view.setTranslationY(0.0f);
                        view.setTranslationX(0.0f);
                        r3.A05(r9);
                        abstractList.remove(size4);
                        if (abstractList.isEmpty()) {
                            r3.A05.remove(size3);
                        }
                    }
                }
            }
            int size5 = r3.A01.size();
            while (true) {
                size5--;
                if (size5 >= 0) {
                    AbstractCollection abstractCollection = (AbstractCollection) r3.A01.get(size5);
                    if (abstractCollection.remove(r9)) {
                        view.setAlpha(1.0f);
                        r3.A05(r9);
                        if (abstractCollection.isEmpty()) {
                            r3.A01.remove(size5);
                        }
                    }
                } else {
                    r3.A0A.remove(r9);
                    r3.A00.remove(r9);
                    r3.A02.remove(r9);
                    r3.A04.remove(r9);
                    r3.A0A();
                    return;
                }
            }
        } else {
            C58912mk r32 = (C58912mk) this;
            View view2 = r9.A0H;
            AnonymousClass0Q7.A0E(view2).A00();
            int size6 = r32.A08.size();
            while (true) {
                size6--;
                if (size6 < 0) {
                    break;
                } else if (((C47042Gf) r32.A08.get(size6)).A04 == r9) {
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    r32.A05(r9);
                    r32.A08.remove(size6);
                }
            }
            r32.A0B(r32.A07, r9);
            if (r32.A09.remove(r9)) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                r32.A05(r9);
            }
            if (r32.A06.remove(r9)) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                r32.A05(r9);
            }
            int size7 = r32.A03.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                List list = (List) r32.A03.get(size7);
                r32.A0B(list, r9);
                if (list.isEmpty()) {
                    r32.A03.remove(size7);
                }
            }
            int size8 = r32.A05.size();
            while (true) {
                size8--;
                if (size8 < 0) {
                    break;
                }
                List list2 = (List) r32.A05.get(size8);
                int size9 = list2.size();
                while (true) {
                    size9--;
                    if (size9 < 0) {
                        break;
                    } else if (((C47042Gf) list2.get(size9)).A04 == r9) {
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        r32.A05(r9);
                        list2.remove(size9);
                        if (list2.isEmpty()) {
                            r32.A05.remove(size8);
                        }
                    }
                }
            }
            int size10 = r32.A01.size();
            while (true) {
                size10--;
                if (size10 < 0) {
                    break;
                }
                List list3 = (List) r32.A01.get(size10);
                if (list3.remove(r9)) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                    r32.A05(r9);
                    if (list3.isEmpty()) {
                        r32.A01.remove(size10);
                    }
                }
            }
            r32.A0A.remove(r9);
            r32.A00.remove(r9);
            r32.A02.remove(r9);
            r32.A04.remove(r9);
            if (!r32.A06()) {
                r32.A03();
            }
        }
    }

    public final void A05(AbstractC11910hD r9) {
        AbstractC16350pf r2 = this.A04;
        if (r2 != null) {
            C30581ba r22 = (C30581ba) r2;
            if (r22 != null) {
                boolean z = true;
                r9.A07(true);
                if (r9.A0A != null && r9.A0B == null) {
                    r9.A0A = null;
                }
                r9.A0B = null;
                if ((r9.A00 & 16) == 0) {
                    RecyclerView recyclerView = r22.A00;
                    View view = r9.A0H;
                    recyclerView.A0Q();
                    C15940oz r7 = recyclerView.A0K;
                    int indexOfChild = ((C30561bY) r7.A01).A00.indexOfChild(view);
                    if (indexOfChild == -1) {
                        r7.A07(view);
                    } else {
                        C15920ox r1 = r7.A00;
                        if (r1.A06(indexOfChild)) {
                            r1.A07(indexOfChild);
                            r7.A07(view);
                            ((C30561bY) r7.A01).A00(indexOfChild);
                        } else {
                            z = false;
                            recyclerView.A0u(!z);
                            if (!z && r9.A0A()) {
                                recyclerView.removeDetachedView(view, false);
                                return;
                            }
                            return;
                        }
                    }
                    AbstractC11910hD A012 = RecyclerView.A01(view);
                    C16480ps r0 = recyclerView.A0x;
                    r0.A09(A012);
                    r0.A08(A012);
                    recyclerView.A0u(!z);
                    if (!z) {
                        return;
                    }
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public boolean A06() {
        if (!(this instanceof C58912mk)) {
            AnonymousClass240 r1 = (AnonymousClass240) this;
            return !r1.A06.isEmpty() || !r1.A07.isEmpty() || !r1.A08.isEmpty() || !r1.A09.isEmpty() || !r1.A04.isEmpty() || !r1.A0A.isEmpty() || !r1.A00.isEmpty() || !r1.A02.isEmpty() || !r1.A05.isEmpty() || !r1.A01.isEmpty() || !r1.A03.isEmpty();
        }
        C58912mk r12 = (C58912mk) this;
        return !r12.A06.isEmpty() || !r12.A07.isEmpty() || !r12.A08.isEmpty() || !r12.A09.isEmpty() || !r12.A04.isEmpty() || !r12.A0A.isEmpty() || !r12.A00.isEmpty() || !r12.A02.isEmpty() || !r12.A05.isEmpty() || !r12.A01.isEmpty() || !r12.A03.isEmpty();
    }

    public boolean A07(AbstractC11910hD r20, AbstractC11910hD r21, C16360pg r22, C16360pg r23) {
        int i;
        int i2;
        AbstractC30641bg r13 = (AbstractC30641bg) this;
        int i3 = r22.A00;
        int i4 = r22.A01;
        if (r21.A0B()) {
            i2 = i4;
            i = i3;
        } else {
            i = r23.A00;
            i2 = r23.A01;
        }
        if (!(r13 instanceof C58912mk)) {
            AnonymousClass240 r132 = (AnonymousClass240) r13;
            if (r20 == r21) {
                return r132.A09(r20, i3, i4, i, i2);
            }
            View view = r20.A0H;
            float translationX = view.getTranslationX();
            float translationY = view.getTranslationY();
            float alpha = view.getAlpha();
            r132.A0B(r20);
            view.setTranslationX(translationX);
            view.setTranslationY(translationY);
            view.setAlpha(alpha);
            r132.A0B(r21);
            View view2 = r21.A0H;
            view2.setTranslationX((float) (-((int) (((float) (i - i3)) - translationX))));
            view2.setTranslationY((float) (-((int) (((float) (i2 - i4)) - translationY))));
            view2.setAlpha(0.0f);
            r132.A07.add(new C16000p5(r20, r21, i3, i4, i, i2));
            return true;
        }
        C58912mk r133 = (C58912mk) r13;
        if (r20 == r21) {
            return r133.A09(r20, i3, i4, i, i2);
        }
        View view3 = r20.A0H;
        float translationX2 = view3.getTranslationX();
        float translationY2 = view3.getTranslationY();
        float alpha2 = view3.getAlpha();
        r133.A0A(r20);
        view3.setTranslationX(translationX2);
        view3.setTranslationY(translationY2);
        view3.setAlpha(alpha2);
        r133.A0A(r21);
        View view4 = r21.A0H;
        view4.setTranslationX((float) (-((int) (((float) (i - i3)) - translationX2))));
        view4.setTranslationY((float) (-((int) (((float) (i2 - i4)) - translationY2))));
        view4.setAlpha(0.0f);
        r133.A07.add(new C47032Ge(r20, r21, i3, i4, i, i2));
        return true;
    }

    public boolean A08(AbstractC11910hD r3, List list) {
        return !((AbstractC30641bg) this).A00 || r3.A08();
    }
}
