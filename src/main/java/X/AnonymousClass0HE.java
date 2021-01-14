package X;

import android.os.Message;
import com.whatsapp.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0HE  reason: invalid class name */
public class AnonymousClass0HE {
    public static volatile AnonymousClass0HE A07;
    public final C000300f A00;
    public final AnonymousClass00S A01;
    public final C02360Br A02;
    public final C014708f A03;
    public final AnonymousClass0HF A04;
    public final AnonymousClass0HH A05;
    public final AnonymousClass0GU A06;

    public AnonymousClass0HE(AnonymousClass00S r1, C000300f r2, C02360Br r3, AnonymousClass0GU r4, C014708f r5, AnonymousClass0HF r6, AnonymousClass0HH r7) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A06 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
    }

    public static AnonymousClass0HE A00() {
        if (A07 == null) {
            synchronized (AnonymousClass0HE.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass0HE(AnonymousClass00S.A00(), C000300f.A00(), C02360Br.A00(), AnonymousClass0GU.A00(), C014708f.A00(), AnonymousClass0HF.A00(), AnonymousClass0HH.A00());
                }
            }
        }
        return A07;
    }

    public AnonymousClass3S1 A01() {
        AnonymousClass357 A022;
        AnonymousClass352 A032;
        boolean z = false;
        if (this.A00.A0D(AbstractC000400g.A2a)) {
            z = true;
        }
        if (!z || (A022 = this.A05.A02()) == null || A022.A01 != 2 || (A032 = this.A04.A03(A022)) == null) {
            return null;
        }
        AnonymousClass3S1 r2 = A032.A01;
        if (r2 == null) {
            Log.i("UserNoticeManager/getBanner/no content for stage 2");
            return null;
        }
        AnonymousClass355 r1 = r2.A00;
        if (!A09(r1)) {
            Log.i("UserNoticeManager/getBanner/banner not shown as per timing");
            return null;
        }
        A06(r1);
        Log.i("UserNoticeManager/getBanner/banner shown");
        return r2;
    }

    public void A02() {
        Log.i("UserNoticeManager/deleteAllUserNoticesWithoutCleanup");
        AnonymousClass0HF r4 = this.A04;
        Log.i("UserNoticeContentManager/deleteAllUserNoticeData");
        File A022 = AnonymousClass0HF.A02(r4.A02.A00.getFilesDir(), "user_notice");
        if (A022 != null) {
            r4.A05.ANF(new RunnableEBaseShape4S0100000_I0_4(A022, 29));
        }
        r4.A00 = null;
        AnonymousClass0HH r2 = this.A05;
        r2.A01().edit().remove("current_user_notice_id").remove("current_user_notice_stage").remove("current_user_notice_stage_timestamp").remove("current_user_notice_version").remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").remove("user_notices").apply();
        r2.A02.clear();
    }

    public final void A03() {
        Log.i("UserNoticeManager/cleanupAfterDelete");
        A04();
        ((AbstractC17680ry) this.A06.get()).A00("tag.whatsapp.usernotice.stageupdate");
        AnonymousClass0HF r1 = this.A04;
        Log.i("UserNoticeContentManager/cancelWork");
        AnonymousClass0GU r2 = r1.A06;
        ((AbstractC17680ry) r2.get()).A00("tag.whatsapp.usernotice.content.fetch");
        ((AbstractC17680ry) r2.get()).A00("tag.whatsapp.usernotice.icon.fetch");
    }

    public final void A04() {
        Log.i("UserNoticeManager/sendWebClientEmptyUpdate");
        C02360Br r1 = this.A02;
        if (r1.A0D.A03()) {
            r1.A0B.A09(Message.obtain(null, 0, 257, 0, new AnonymousClass22R(-1, false, -1)));
        }
    }

    public final void A05(int i, int i2, int i3) {
        boolean z = true;
        if (i2 <= 1) {
            AnonymousClass008.A0v("UserNoticeManager/updateWebClient/no update sent, stage: ", i2);
        } else if (i2 == 3 || i2 == 5) {
            A04();
        } else {
            if (i2 != 4) {
                z = false;
            }
            StringBuilder sb = new StringBuilder("UserNoticeManager/updateWebClient/noticeId: ");
            sb.append(i);
            sb.append(" blocking: ");
            sb.append(z);
            sb.append(" version:");
            AnonymousClass008.A1L(sb, i3);
            C02360Br r1 = this.A02;
            if (r1.A0D.A03()) {
                r1.A0B.A09(Message.obtain(null, 0, 257, 0, new AnonymousClass22R(i, z, i3)));
            }
        }
    }

    public final void A06(AnonymousClass355 r6) {
        AnonymousClass353 r0 = r6.A00;
        if (r0 == null || r0.A01 == null) {
            Log.i("UserNoticeManager/handleRepeatTimingIfNecessary/no repeat duration");
            return;
        }
        Log.i("UserNoticeManager/handleRepeatTimingIfNecessary/set repeat values");
        AnonymousClass0HH r4 = this.A05;
        r4.A01().edit().putInt("current_user_notice_duration_repeat_index", r4.A01().getInt("current_user_notice_duration_repeat_index", 0) + 1).apply();
        r4.A01().edit().putLong("current_user_notice_duration_repeat_timestamp", this.A01.A05()).apply();
    }

    public final void A07(AnonymousClass357 r12, int i) {
        int i2 = r12.A00;
        AnonymousClass008.A0y("UserNoticeManager/updateUserNoticeStage/updating to new stage: ", i, " noticeId: ", i2);
        AnonymousClass0HH r1 = this.A05;
        long A052 = this.A01.A05();
        int i3 = r12.A02;
        r1.A04(new AnonymousClass357(i2, i, A052, i3));
        A05(i2, i, i3);
        r1.A01().edit().remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").apply();
        StringBuilder A0U = AnonymousClass008.A0U("UserNoticeManager/enqueueStageUpdateWork/notice id: ", i2, " stage: ", i, " version: ");
        A0U.append(i3);
        Log.i(A0U.toString());
        HashMap hashMap = new HashMap();
        hashMap.put("notice_id", Integer.valueOf(i2));
        hashMap.put("stage", Integer.valueOf(i));
        hashMap.put("version", Integer.valueOf(i3));
        C17550rj r5 = new C17550rj(hashMap);
        C17550rj.A01(r5);
        C17520rg r13 = new C17520rg();
        r13.A03 = EnumC07010Vo.CONNECTED;
        C17530rh r2 = new C17530rh(r13);
        C31001cM r4 = new C31001cM(UserNoticeStageUpdateWorker.class);
        r4.A01.add("tag.whatsapp.usernotice.stageupdate");
        r4.A00.A09 = r2;
        r4.A02(EnumC06980Vl.EXPONENTIAL, 1, TimeUnit.HOURS);
        r4.A00.A0A = r5;
        AnonymousClass0s0 A002 = r4.A00();
        ((AbstractC17680ry) this.A06.get()).A02(AnonymousClass008.A0H("tag.whatsapp.usernotice.stageupdate.", i2, ".", i), EnumC17570rl.REPLACE, Collections.singletonList(A002));
    }

    public final void A08(AnonymousClass357 r11, AnonymousClass352 r12) {
        AnonymousClass354 r0;
        AnonymousClass354 r02;
        AnonymousClass354 r03;
        int i = r11.A01;
        StringBuilder A0S = AnonymousClass008.A0S("UserNoticeManager/transitionUserNoticeStageIfNecessary/noticeId: ");
        A0S.append(r11.A00);
        A0S.append(" currentStage: ");
        A0S.append(i);
        Log.i(A0S.toString());
        if (i == 0) {
            Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary/stage 0, no timing transition needed");
            A07(r11, 1);
        } else if (i == 5) {
            Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary/stage 5, no timing transition needed");
        } else if (r12 == null) {
            Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary/no content");
        } else {
            long A052 = this.A01.A05();
            ArrayList arrayList = new ArrayList();
            AnonymousClass355 A17 = C002001d.A17(i, r12);
            if (!(A17 == null || (r03 = A17.A01) == null)) {
                arrayList.add(new AnonymousClass359(i, 1, r03.A00));
            }
            int A053 = C002001d.A05(i, r12);
            while (A053 < 5) {
                AnonymousClass355 A172 = C002001d.A17(A053, r12);
                if (!(A172 == null || (r02 = A172.A02) == null)) {
                    arrayList.add(new AnonymousClass359(A053, 0, r02.A00));
                }
                AnonymousClass355 A173 = C002001d.A17(A053, r12);
                if (!(A173 == null || (r0 = A173.A01) == null)) {
                    arrayList.add(new AnonymousClass359(A053, 1, r0.A00));
                }
                A053++;
            }
            Iterator it = arrayList.iterator();
            AnonymousClass359 r5 = null;
            while (it.hasNext()) {
                AnonymousClass359 r3 = (AnonymousClass359) it.next();
                if (r3.A02 > A052) {
                    break;
                }
                r5 = r3;
            }
            if (r5 == null) {
                AnonymousClass355 A174 = C002001d.A17(i, r12);
                AnonymousClass355 A175 = C002001d.A17(A053, r12);
                if (A175 != null && A175.A02 != null) {
                    Log.i("UserNoticeManager/handleNextStageStartTime/next stage start time exists");
                } else if (A174 == null) {
                } else {
                    if (A174.A01 != null) {
                        Log.i("UserNoticeManager/handleCurrentStageEndTiming/current stage end time exists");
                        return;
                    }
                    AnonymousClass353 r32 = A174.A00;
                    if (r32 != null) {
                        Log.i("UserNoticeManager/handleCurrentStageDuration/current stage duration exists");
                        long j = r32.A00;
                        if (j != -1) {
                            long j2 = r11.A03;
                            Log.i("UserNoticeManager/handleCurrentStageStaticDuration/static duration exists");
                            if (A052 >= j2 + j) {
                                Log.i("UserNoticeManager/handleCurrentStageStaticDuration/current stage static duration expired");
                                A07(r11, A053);
                                return;
                            }
                            return;
                        }
                        long[] jArr = r32.A01;
                        if (jArr != null) {
                            Log.i("UserNoticeManager/handleCurrentStageRepeatDuration/repeat duration exists");
                            if (this.A05.A01().getInt("current_user_notice_duration_repeat_index", 0) > jArr.length) {
                                Log.i("UserNoticeManager/handleCurrentStageRepeatDuration/current stage repeat duration complete");
                                A07(r11, A053);
                            }
                        }
                    }
                }
            } else if (r5.A01 == 0) {
                StringBuilder A0S2 = AnonymousClass008.A0S("UserNoticeManager/handleEligibleFutureStartEndTiming/passed start timing of stage:");
                int i2 = r5.A00;
                AnonymousClass008.A1L(A0S2, i2);
                A07(r11, i2);
            } else {
                StringBuilder A0S3 = AnonymousClass008.A0S("UserNoticeManager/handleEligibleFutureStartEndTiming/passed end timing of stage: ");
                int i3 = r5.A00;
                AnonymousClass008.A1L(A0S3, i3);
                A07(r11, C002001d.A05(i3, r12));
            }
        }
    }

    public final boolean A09(AnonymousClass355 r10) {
        long[] jArr;
        AnonymousClass353 r0 = r10.A00;
        boolean z = true;
        if (r0 == null || (jArr = r0.A01) == null) {
            Log.i("UserNoticeManager/shouldShowStage/no repeat duration");
            return true;
        }
        AnonymousClass0HH r3 = this.A05;
        int i = r3.A01().getInt("current_user_notice_duration_repeat_index", 0);
        if (i == 0) {
            Log.i("UserNoticeManager/shouldShowStage/allow first repeat");
            return true;
        } else if (i > jArr.length) {
            Log.i("UserNoticeManager/shouldShowStage/no more repeats");
            return false;
        } else {
            if (this.A01.A05() - r3.A01().getLong("current_user_notice_duration_repeat_timestamp", 0) < jArr[i - 1]) {
                z = false;
            }
            AnonymousClass008.A1H("UserNoticeManager/shouldShowStage/repeatTimeElapse: ", z);
            return z;
        }
    }
}
