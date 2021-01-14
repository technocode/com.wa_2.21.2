package com.whatsapp.voipcalling;

import X.AbstractC000400g;
import X.AbstractC07250Wp;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00E;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass04g;
import X.AnonymousClass0CW;
import X.AnonymousClass0FS;
import X.AnonymousClass0Fh;
import X.AnonymousClass0QM;
import X.AnonymousClass0QY;
import X.AnonymousClass0Yz;
import X.AnonymousClass0Z0;
import X.AnonymousClass1XB;
import X.AnonymousClass39X;
import X.AnonymousClass39Z;
import X.AnonymousClass3U7;
import X.C002001d;
import X.C09260ca;
import X.C29131Xe;
import X.C70073Jq;
import android.media.SoundPool;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VoiceService$VoiceServiceEventCallback implements VoipEventCallback {
    public final AnonymousClass39Z bufferQueue = new AnonymousClass39Z();
    public final AnonymousClass0CW mediaHttpClientFactory;
    public final /* synthetic */ AnonymousClass3U7 this$0;

    private boolean isFatalErrorCode(int i) {
        return i == 432;
    }

    public VoiceService$VoiceServiceEventCallback(AnonymousClass3U7 r2, AnonymousClass0CW r3) {
        this.this$0 = r2;
        this.mediaHttpClientFactory = r3;
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void NoSamplingRatesForAudioRecord() {
        Log.i("VoiceService:NoSamplingRatesForAudioRecord");
        AnonymousClass3U7 r2 = this.this$0;
        r2.A0P(23, r2.A1a.A06(R.string.voip_call_failed_audio_record_issue));
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void audioDriverRestart() {
        Log.i("VoiceService:audioDriverRestart");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void audioInitError() {
        Log.i("VoiceService:audioInitError");
        this.this$0.A21.A00.edit().remove("audio_sampling_hash").remove("audio_sampling_rates").apply();
        AnonymousClass3U7 r3 = this.this$0;
        r3.A0P(23, r3.A1a.A06(R.string.voip_call_failed_audio_record_issue));
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void audioRouteChangeRequest(int i) {
        Log.i("VoiceService:audioRouteChangeRequest");
        this.this$0.A0J.removeMessages(27);
        this.this$0.A0J.obtainMessage(27, i, 0).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void audioStreamStarted() {
        Log.i("VoiceService:audioStreamStarted");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void audioTestReplayFinished() {
        throw new AssertionError("audioTestReplayFinished is a debug only method");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void batteryLevelLow() {
        Log.i("VoiceService:batteryLevelLow");
        this.this$0.A0J.sendEmptyMessage(18);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callAcceptFailed() {
        Log.i("VoiceService:callAcceptFailed");
        this.this$0.A0P(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callAcceptReceived() {
        Log.i("VoiceService:callAcceptReceived");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callAutoConnected(String str, String str2) {
        Log.i("VoiceService:callAutoConnected");
        Message.obtain(this.this$0.A0J, 31, new AnonymousClass39X(str, str2)).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callCaptureBufferFilled(Voip.DebugTapType debugTapType, byte[] bArr, int i, Voip.RecordingInfo[] recordingInfoArr) {
        AnonymousClass00E.A06(false);
        if (bArr != null && bArr.length > 0 && i > 0 && recordingInfoArr != null) {
            AnonymousClass3U7.A2H.execute(new RunnableEBaseShape1S0401000_I1(this, i, recordingInfoArr, debugTapType, bArr, 1));
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callCaptureEnded(Voip.DebugTapType debugTapType, Voip.RecordingInfo[] recordingInfoArr) {
        AnonymousClass00E.A06(false);
        AnonymousClass3U7.A2H.execute(new RunnableEBaseShape9S0200000_I1_4(recordingInfoArr, debugTapType, 33));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0112, code lost:
        if (r3.delete() != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0124, code lost:
        if (r3.delete() == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0126, code lost:
        com.whatsapp.util.Log.i("app/VoiceService: time series log could not be deleted");
     */
    @Override // com.whatsapp.voipcalling.VoipEventCallback
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callEnding(com.whatsapp.voipcalling.Voip.CallLogInfo r20, int r21) {
        /*
        // Method dump skipped, instructions count: 786
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback.callEnding(com.whatsapp.voipcalling.Voip$CallLogInfo, int):void");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callMissed(String str, String str2, String str3, String str4, int i, long j, boolean z, CallGroupInfo callGroupInfo, boolean z2) {
        int i2;
        boolean z3;
        Log.i("VoiceService:callMissed");
        if (callGroupInfo == null || callGroupInfo.participants.length <= 0) {
            i2 = -1;
        } else {
            i2 = callGroupInfo.transactionId;
        }
        AnonymousClass3U7 r2 = this.this$0;
        UserJid nullable = UserJid.getNullable(str2);
        if (nullable != null) {
            AnonymousClass0QM A08 = r2.A08(nullable, false, str, i2);
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo != null) {
                z3 = str.equals(callInfo.callWaitingInfo.A04);
                if (A08 != null) {
                    A08.A0A(callInfo.groupJid);
                } else {
                    return;
                }
            } else {
                z3 = false;
                if (A08 == null) {
                    return;
                }
            }
            this.this$0.A0i(str, A08, 4, j, Integer.valueOf(i), str3, str4, z, callGroupInfo, z3, z2);
            return;
        }
        throw null;
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callOfferAcked() {
        AnonymousClass0QM A08;
        Log.i("VoiceService:callOfferAcked");
        this.this$0.A0I.removeMessages(2);
        this.this$0.A0r = true;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            if (callInfo.isJoinableGroupCall && (A08 = this.this$0.A08(callInfo.initialPeerJid, callInfo.isCaller, callInfo.callId, callInfo.initialGroupTransactionId)) != null) {
                for (UserJid userJid : callInfo.participants.keySet()) {
                    AnonymousClass0QY r0 = (AnonymousClass0QY) callInfo.participants.get(userJid);
                    if (r0 != null && !r0.A0D) {
                        A08.A0B(userJid, 2);
                    }
                }
                A08.A0C(callInfo.videoEnabled);
                A08.A09(DeviceJid.of(callInfo.creatorJid));
                this.this$0.A0Z(A08, true);
                this.this$0.A1d.A08(A08);
            }
            AnonymousClass3U7.A05(this.this$0, callInfo.videoEnabled);
            if (Voip.A00("options.caller_end_call_threshold") != null) {
                this.this$0.A0b = Voip.A01("options.caller_end_call_threshold");
            }
            Voip.CallState callState = callInfo.callState;
            if (callState == Voip.CallState.CALLING || callState == Voip.CallState.PRE_ACCEPT_RECEIVED) {
                Integer A01 = Voip.A01("options.caller_timeout");
                if (A01 != null) {
                    long intValue = (long) (A01.intValue() * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AnonymousClass3U7 r9 = this.this$0;
                    long j = intValue - (elapsedRealtime - r9.A08);
                    if (j > 0 && j < 120000) {
                        r9.A0I.removeCallbacksAndMessages(null);
                        this.this$0.A0I.sendEmptyMessageDelayed(0, j);
                        StringBuilder sb = new StringBuilder("voip/receive_message/call-offer-ack change the caller timeout to ");
                        sb.append(intValue);
                        sb.append(", remaining ");
                        sb.append(j);
                        Log.i(sb.toString());
                    }
                }
                this.this$0.A0c(callInfo.callState);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (isSelfNacked(r11) != false) goto L_0x0051;
     */
    @Override // com.whatsapp.voipcalling.VoipEventCallback
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callOfferNacked(com.whatsapp.voipcalling.CallOfferAckError[] r11) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback.callOfferNacked(com.whatsapp.voipcalling.CallOfferAckError[]):void");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callOfferReceiptReceived() {
        Log.i("VoiceService:callOfferReceiptReceived");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callOfferReceived() {
        Log.i("VoiceService:callOfferReceived");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callOfferSent() {
        Log.i("VoiceService:callOfferSent");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callPreAcceptReceived() {
        Log.i("VoiceService:callPreAcceptReceived");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r12.equals("uncallable") != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        if (r12.equals("tos") != false) goto L_0x005b;
     */
    @Override // com.whatsapp.voipcalling.VoipEventCallback
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callRejectReceived(java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback.callRejectReceived(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        if (r7 != 7) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.whatsapp.voipcalling.VoipEventCallback
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callStateChanged(com.whatsapp.voipcalling.Voip.CallState r18, com.whatsapp.voipcalling.CallInfo r19) {
        /*
        // Method dump skipped, instructions count: 415
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback.callStateChanged(com.whatsapp.voipcalling.Voip$CallState, com.whatsapp.voipcalling.CallInfo):void");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callTerminateReceived(String str) {
        AnonymousClass04g r5;
        Pair A00;
        C29131Xe r6;
        AnonymousClass008.A18("VoiceService:callTerminateReceived, callId:", str);
        if (str != null && !TextUtils.equals(Voip.getCurrentCallId(), str) && AnonymousClass0Fh.A03() && (A00 = (r5 = Voip.A01).A00(str)) != null && (r6 = (C29131Xe) A00.second) != null) {
            String A1n = C002001d.A1n(str);
            AnonymousClass0FS r3 = this.this$0.A1d;
            C70073Jq r7 = r6.A01;
            DeviceJid deviceJid = (DeviceJid) ((AnonymousClass1XB) r7).A00;
            if (deviceJid != null) {
                AnonymousClass0QM A04 = r3.A04(new C09260ca(deviceJid.userJid, false, A1n, r6.A00));
                if (A04 != null) {
                    this.this$0.A0i(str, A04, 4, r7.A00, 5, r7.A04, r7.A03, false, r6.A02, false, r6.A03);
                }
                r5.A01(str);
                return;
            }
            throw null;
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callWaitingStateChanged(int i) {
        String str;
        StringBuilder sb = new StringBuilder("VoiceService:callWaitingStateChanged ");
        sb.append(i);
        Log.i(sb.toString());
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            str = callInfo.callWaitingInfo.A04;
        } else {
            str = null;
        }
        this.this$0.A0J.removeMessages(34);
        this.this$0.A0J.obtainMessage(34, i, 0, str).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void errorGatheringHostCandidates() {
        Log.i("VoiceService:errorGatheringHostCandidates");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d8, code lost:
        if (r3 > 100.0f) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014a, code lost:
        if (((android.media.audiofx.AcousticEchoCanceler) r0).getEnabled() != false) goto L_0x014c;
     */
    @Override // com.whatsapp.voipcalling.VoipEventCallback
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fieldstatsReady(com.whatsapp.fieldstats.events.WamCall r22, java.lang.String r23, boolean r24, boolean r25) {
        /*
        // Method dump skipped, instructions count: 946
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback.fieldstatsReady(com.whatsapp.fieldstats.events.WamCall, java.lang.String, boolean, boolean):void");
    }

    public byte[] getByteBuffer(int i) {
        AnonymousClass39Z r3 = this.bufferQueue;
        synchronized (r3) {
            Iterator it = r3.A01.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                if (bArr.length >= i) {
                    it.remove();
                    return bArr;
                }
            }
            int i2 = r3.A00 + i;
            r3.A00 = i2;
            StringBuilder sb = new StringBuilder();
            sb.append(r3.getClass().getName());
            sb.append(" allocating buffer of length ");
            sb.append(i);
            sb.append(", total allocated ");
            sb.append(i2);
            Log.d(sb.toString());
            return new byte[i];
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void groupInfoChanged() {
        boolean z;
        Log.i("VoiceService:groupInfoChanged");
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            z = false;
        } else if (callInfo.callState == Voip.CallState.NONE) {
            z = true;
        } else {
            this.this$0.A0J.removeMessages(25);
            this.this$0.A0J.sendEmptyMessage(25);
            return;
        }
        AnonymousClass00E.A08(z, " CallInfo should not be null in groupInfoChanged callback");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void groupParticipantLeft(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder("VoiceService:groupParticipantLeft (");
        sb.append(i);
        sb.append(")");
        Log.i(sb.toString());
        if (i == 4) {
            if (str2 == null) {
                str2 = "";
            }
            callRejectReceived(str, str2);
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handleAcceptAckFailed(String str, int i) {
        StringBuilder sb = new StringBuilder("VoiceService:handleAcceptAckFailed, error_code = ");
        sb.append(i);
        sb.append("error_raw_device_jid: ");
        sb.append(str);
        Log.i(sb.toString());
        if (i != 434) {
            this.this$0.A0P(25, null);
        } else {
            this.this$0.A0P(26, null);
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handleAcceptFailed() {
        Log.i("VoiceService:handleAcceptFailed");
        this.this$0.A0P(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handleCallFatal(int i) {
        AnonymousClass008.A0v("VoiceService:handleCallFatal Reason: ", i);
        AnonymousClass009 r2 = this.this$0.A1E;
        StringBuilder A0S = AnonymousClass008.A0S("voip/callFatal Reason:");
        A0S.append(Integer.toString(i));
        r2.A03(A0S.toString(), 3);
        this.this$0.A0P(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handleFDLeakDetected() {
        Log.i("VoiceService:handleFDLeakDetected");
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            Thread key = entry.getKey();
            StringBuilder sb = new StringBuilder("\n");
            sb.append("thread_dump name=");
            sb.append(key.getName());
            sb.append(" state=");
            sb.append(key.getState());
            sb.append(" tid=");
            sb.append(key.getId());
            sb.append(" ");
            sb.append(key.getClass());
            sb.append('\n');
            Log.log(3, sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append("thread_dump total threads count = ");
        sb2.append(allStackTraces.size());
        sb2.append("\n");
        Log.log(3, sb2.toString());
        this.this$0.A1E.A03("voip/transport/handleFDLeakDetected", 7);
    }

    private void handleFatalOfferNack(ArrayList arrayList, int i, CallInfo callInfo) {
        int i2 = 3;
        if (i != 401) {
            int i3 = 2;
            if (i != 460) {
                i2 = 15;
                if (i != 431) {
                    if (i != 432) {
                        i2 = 0;
                        switch (i) {
                            case 403:
                                if (callInfo.videoEnabled) {
                                    i2 = 7;
                                    break;
                                }
                                break;
                            case 404:
                                i2 = 16;
                                break;
                            case 405:
                                i2 = 4;
                                break;
                            case 406:
                                if (callInfo.videoEnabled) {
                                    i3 = 11;
                                    break;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 426:
                                        i2 = 1;
                                        if (callInfo.videoEnabled) {
                                            i2 = 9;
                                            break;
                                        }
                                        break;
                                    case 427:
                                        i2 = 12;
                                        break;
                                    case 428:
                                        i2 = 14;
                                        break;
                                    default:
                                        if (callInfo.videoEnabled) {
                                            i2 = 8;
                                            break;
                                        }
                                        break;
                                }
                        }
                    } else {
                        AnonymousClass3U7.A04(this.this$0, arrayList, 2);
                        i2 = -1;
                    }
                }
            } else if (callInfo.videoEnabled) {
                i3 = 10;
            }
            i2 = i3;
        }
        if (i2 != -1) {
            AnonymousClass3U7 r2 = this.this$0;
            AnonymousClass02M r0 = r2.A1H;
            r0.A02.post(new RunnableEBaseShape1S1201000_I1(r2, arrayList, null, i2, 3));
        }
        this.this$0.A0P(25, null);
    }

    private void handleNonFatalOfferNack(List list, int i) {
        String A0A;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.this$0.A1T.A04(this.this$0.A1S.A0A((AnonymousClass02N) it.next())));
        }
        String A1g = C002001d.A1g(this.this$0.A1T.A02, true, arrayList);
        if (i == 427) {
            CallInfo callInfo = Voip.getCallInfo();
            AnonymousClass0QY r2 = null;
            if (callInfo != null) {
                if (list.size() == 1) {
                    r2 = callInfo.getInfoByJid((UserJid) list.get(0));
                }
                if (callInfo.isGroupCall && callInfo.participants.size() > 4) {
                    AnonymousClass3U7.A04(this.this$0, list, 1);
                    return;
                } else if (r2 != null && r2.A01 == 1) {
                    A0A = this.this$0.A1a.A0D(R.string.voip_peer_group_call_not_supported, arrayList.get(0));
                }
            }
            A0A = this.this$0.A1a.A0A(R.plurals.voip_group_call_not_supported_plural, (long) list.size(), A1g);
        } else if (i == 428) {
            int A06 = this.this$0.A1M.A06(AbstractC000400g.A39);
            A0A = this.this$0.A1a.A0A(R.plurals.voip_group_call_reach_maximum, (long) A06, Integer.valueOf(A06));
        } else if (i != 431) {
            AnonymousClass00E.A08(false, "Unknown error code");
            A0A = this.this$0.A1a.A0A(R.plurals.voip_not_allowed_at_this_time_plural, (long) list.size(), A1g);
        } else {
            A0A = this.this$0.A1a.A0D(R.string.unable_to_add_participant_to_group_call, A1g);
        }
        Message.obtain(this.this$0.A0J, 26, A0A).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handleOfferAckFailed() {
        Log.i("VoiceService:handleOfferAckFailed");
        this.this$0.A0P(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handleOfferFailed() {
        Log.i("VoiceService:handleOfferFailed");
        this.this$0.A0P(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handlePreAcceptFailed() {
        Log.i("VoiceService:handlePreAcceptFailed");
        this.this$0.A0P(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void interruptionStateChanged() {
        Log.i("VoiceService:interruptionStateChanged");
        this.this$0.A0J.removeMessages(30);
        this.this$0.A0J.obtainMessage(30).sendToTarget();
        AnonymousClass0Z0 r3 = this.this$0.A1y;
        r3.A00.obtainMessage(1, new AnonymousClass0Yz("refresh_notification", null, null)).sendToTarget();
    }

    private boolean isSelfNacked(CallOfferAckError[] callOfferAckErrorArr) {
        for (CallOfferAckError callOfferAckError : callOfferAckErrorArr) {
            if (this.this$0.A1I.A09(callOfferAckError.errorJid)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ void lambda$callCaptureBufferFilled$2743$VoiceService$VoiceServiceEventCallback(Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType, byte[] bArr, int i) {
        int ordinal = debugTapType.ordinal();
        Voip.RecordingInfo recordingInfo = recordingInfoArr[ordinal];
        if (recordingInfo == null) {
            recordingInfoArr[ordinal] = new Voip.RecordingInfo(this.this$0.A1F, debugTapType);
            recordingInfo = recordingInfoArr[ordinal];
        }
        OutputStream outputStream = recordingInfo.outputStream;
        if (outputStream == null) {
            Log.e("voip/callCaptureBufferFilled/OutputStream/null");
            Voip.stopCallRecording();
            return;
        }
        try {
            outputStream.write(bArr, 0, i);
        } catch (IOException e) {
            Log.e(e);
        }
        AnonymousClass39Z r1 = this.bufferQueue;
        synchronized (r1) {
            if (bArr != null) {
                r1.A01.addFirst(bArr);
            }
        }
        if (recordingInfo.outputFile.length() >= 52428800) {
            Log.i("callCaptureBufferFilled stop recording due to exceeds file size limit");
            Voip.stopCallRecording();
        }
    }

    public static /* synthetic */ void lambda$callCaptureEnded$2744(Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType) {
        OutputStream outputStream;
        Voip.RecordingInfo recordingInfo = recordingInfoArr[debugTapType.ordinal()];
        if (recordingInfo != null && (outputStream = recordingInfo.outputStream) != null) {
            try {
                outputStream.close();
                StringBuilder sb = new StringBuilder();
                sb.append("callCaptureEnded ");
                sb.append(recordingInfo.outputFile);
                sb.append(" size ");
                sb.append(recordingInfo.outputFile.length());
                Log.i(sb.toString());
            } catch (IOException e) {
                Log.e(e);
            }
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void lobbyNacked(int i, String str) {
        AnonymousClass0QM A02;
        Log.i("VoiceService:lobbyNacked");
        long A022 = this.this$0.A21.A02(str);
        if (!(A022 == -1 || (A02 = this.this$0.A1d.A02(A022)) == null)) {
            AnonymousClass008.A18("VoiceService:lobbyNacked Turning off joinability and removing mapping for ", str);
            this.this$0.A0Z(A02, false);
            this.this$0.A1d.A08(A02);
        }
        this.this$0.A0P(25, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void mediaStreamError() {
        Log.i("VoiceService:mediaStreamError");
        this.this$0.A0P(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void mediaStreamStartError() {
        Log.i("VoiceService:mediaStreamStartError");
        this.this$0.A0P(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void missingRelayInfo() {
        Log.i("VoiceService:missingRelayInfo");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void muteStateChanged() {
        Log.i("VoiceService:muteStateChanged");
        this.this$0.A0J.removeMessages(32);
        this.this$0.A0J.sendEmptyMessage(32);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void p2pNegotaitionFailed() {
        Log.i("VoiceService:p2pNegotaitionFailed");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void p2pNegotiationSuccess() {
        Log.i("VoiceService:p2pNegotiationSuccess");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void p2pTransportCreateFailed() {
        Log.i("VoiceService:p2pTransportCreateFailed");
        this.this$0.A0P(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void p2pTransportMediaCreateFailed() {
        Log.i("VoiceService:p2pTransportMediaCreateFailed");
        this.this$0.A0P(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void p2pTransportRestartSuccess() {
        Log.i("VoiceService:p2pTransportRestartSuccess");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void p2pTransportStartFailed() {
        Log.i("VoiceService:p2pTransportStartFailed");
        this.this$0.A0P(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void peerBatteryLevelLow(String str) {
        UserJid nullable = UserJid.getNullable(str);
        if (nullable != null) {
            AnonymousClass008.A14("VoiceService:peerBatteryLevelLow, Jid:", nullable);
            AnonymousClass3U7 r1 = this.this$0;
            if (r1 != null) {
                Message message = new Message();
                message.what = 19;
                message.obj = nullable;
                r1.A0J.sendMessageDelayed(message, 3000);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void peerVideoStateChanged(int i) {
        AnonymousClass008.A0v("VoiceService:peerVideoStateChanged ", i);
        this.this$0.A0J.removeMessages(12);
        this.this$0.A0J.obtainMessage(12, i, 0).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void playCallTone(int i) {
        AnonymousClass008.A0v("VoiceService:playCallTone type:", i);
        Number number = (Number) this.this$0.A28.get(Integer.valueOf(i));
        AnonymousClass3U7 r3 = this.this$0;
        if (r3.A0G == null) {
            r3.A0G = new SoundPool(1, 0, 0);
        }
        if (number != null) {
            AnonymousClass3U7 r2 = this.this$0;
            float f = 0.5f;
            if (r2.A1z.A00 == 2) {
                f = 1.0f;
            }
            r2.A0G.play(number.intValue(), f, f, 0, 0, 1.0f);
            return;
        }
        Log.e("VoiceService:playCallTone sound pool has not been loaded successfully");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void rejectedDecryptionFailure(String str, String str2, byte[] bArr, int i) {
        DeviceJid nullable = DeviceJid.getNullable(str);
        if (nullable != null) {
            StringBuilder sb = new StringBuilder("VoiceService:rejectedDecryptionFailure, Jid:");
            sb.append(nullable);
            sb.append(", callId:");
            sb.append(str2);
            sb.append(", retryCount:");
            AnonymousClass008.A1L(sb, i);
            this.this$0.A26.put(nullable, str2);
            if (!this.this$0.A1t.A02(nullable, C002001d.A1n(str2), bArr, i)) {
                this.this$0.A0P(27, null);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void relayBindsFailed(boolean z) {
        String A06;
        StringBuilder sb = new StringBuilder("VoiceService:relayBindsFailed self bad asn=");
        sb.append(z);
        Log.i(sb.toString());
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            Log.e("we are not in a active call");
            return;
        }
        AnonymousClass3U7 r5 = this.this$0;
        r5.A0x = z;
        int A03 = r5.A1V.A03(true);
        if (A03 == 0) {
            r5.A0P(3, r5.A1a.A06(R.string.voip_call_failed_no_network));
            return;
        }
        if (callInfo.isCaller || callInfo.callState == Voip.CallState.ACCEPT_SENT) {
            if (r5.A0x) {
                if (A03 == 1) {
                    A06 = r5.A1a.A06(R.string.voip_not_connected_wifi);
                } else {
                    A06 = r5.A1a.A06(R.string.voip_not_connected_cellular);
                }
            } else if (A03 == 1) {
                A06 = r5.A1a.A06(R.string.voip_call_failed_incompatible_wifi);
            } else {
                A06 = r5.A1a.A06(R.string.voip_call_failed_incompatible_cellular);
            }
            UserJid userJid = callInfo.peerJid;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(userJid);
            AnonymousClass02M r0 = r5.A1H;
            r0.A02.post(new RunnableEBaseShape1S1201000_I1(r5, arrayList, A06, 5, 3));
        }
        r5.A0P(3, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void relayCreateSuccess() {
        Log.i("VoiceService:relayCreateSuccess");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void relayElectionSendFailed() {
        Log.i("VoiceService:relayElectionSendFailed");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void relayLatencySendFailed() {
        Log.i("VoiceService:relayLatencySendFailed");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void restartCamera() {
        AbstractC07250Wp r3;
        Log.i("VoiceServiceEventCallback:restartCamera ");
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null && (r3 = this.this$0.A0W) != null) {
            AnonymousClass0QY r2 = callInfo.self;
            VoipActivityV2 voipActivityV2 = (VoipActivityV2) r3;
            Log.i("VoipActivityV2/restartCameraPreview ");
            voipActivityV2.A0E.removeMessages(12);
            voipActivityV2.A0r();
            voipActivityV2.A1L(voipActivityV2.A0u, r2);
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void rtcpByeReceived() {
        Log.i("VoiceService:rtcpByeReceived");
        this.this$0.A0P(18, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void rxTimeout() {
        Log.i("VoiceService:rxTimeout");
        this.this$0.A0P(5, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void rxTrafficStarted() {
        Log.i("VoiceService:rxTrafficStarted");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void rxTrafficStateForPeerChanged() {
        Log.i("VoiceService:rxTrafficStateForPeerChanged");
        this.this$0.A0J.removeMessages(33);
        this.this$0.A0J.sendEmptyMessage(33);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void rxTrafficStopped() {
        boolean z = this.this$0.A1C.A00;
        StringBuilder A0S = AnonymousClass008.A0S("VoiceService:rxTrafficStopped.  powerSavingMode: ");
        A0S.append(this.this$0.A0l());
        A0S.append(", isAppInForeground: ");
        A0S.append(z);
        A0S.append(", screenLocked: ");
        AnonymousClass008.A1a(A0S, this.this$0.A11);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void selfVideoStateChanged(int i) {
        AnonymousClass008.A0v("VoiceService:selfVideoStateChanged ", i);
        this.this$0.A0J.removeMessages(11);
        this.this$0.A0J.obtainMessage(11, i, 0).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void sendAcceptFailed() {
        Log.i("VoiceService:sendAcceptFailed");
        this.this$0.A0F();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void sendOfferFailed() {
        Log.i("VoiceService:sendOfferFailed");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void soundPortCreateFailed() {
        Log.i("VoiceService:soundPortCreateFailed");
        this.this$0.A0P(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void soundPortCreated(int i) {
        StringBuilder sb = new StringBuilder("VoiceService:soundPortCreated with engine type ");
        sb.append(i);
        Log.i(sb.toString());
        Integer A01 = Voip.A01("aec.builtin");
        AnonymousClass3U7 r1 = this.this$0;
        if (r1.A0j == null && A01 != null) {
            int intValue = A01.intValue();
            if (intValue == 2) {
                r1.A0j = Voip.A02(r1.A1u.previousAudioSessionId, true);
            } else if (intValue == 3) {
                r1.A0j = Voip.A02(r1.A1u.previousAudioSessionId, false);
            }
        }
        Integer A012 = Voip.A01("agc.builtin");
        AnonymousClass3U7 r12 = this.this$0;
        if (r12.A0k == null && A012 != null) {
            int intValue2 = A012.intValue();
            if (intValue2 == 2) {
                r12.A0k = Voip.A03(r12.A1u.previousAudioSessionId, true);
            } else if (intValue2 == 3) {
                r12.A0k = Voip.A03(r12.A1u.previousAudioSessionId, false);
            }
        }
        Integer A013 = Voip.A01("ns.builtin");
        AnonymousClass3U7 r13 = this.this$0;
        if (r13.A0l == null && A013 != null) {
            int intValue3 = A013.intValue();
            if (intValue3 == 2) {
                r13.A0l = Voip.A04(r13.A1u.previousAudioSessionId, true);
            } else if (intValue3 == 3) {
                r13.A0l = Voip.A04(r13.A1u.previousAudioSessionId, false);
            }
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void syncDevices(SyncDevicesUserInfo[] syncDevicesUserInfoArr) {
        Log.i("VoiceService:syncDevices ");
        ArrayList arrayList = new ArrayList();
        for (SyncDevicesUserInfo syncDevicesUserInfo : syncDevicesUserInfoArr) {
            if (!this.this$0.A1f.A0D(new UserJid[]{syncDevicesUserInfo.jid}, syncDevicesUserInfo.phash)) {
                arrayList.add(syncDevicesUserInfo.jid);
            }
        }
        if (!arrayList.isEmpty()) {
            this.this$0.A1U.A02((UserJid[]) arrayList.toArray(new UserJid[0]), 4);
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void transportCandSendFailed() {
        Log.i("VoiceService:transportCandSendFailed");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void txTimeout() {
        Log.i("VoiceService:txTimeout");
        this.this$0.A0P(6, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void updateJoinableCallLog(int i, String str, UserJid[] userJidArr) {
        Log.i("VoiceService:updateJoinableCallLog");
        this.this$0.A0J.removeMessages(36);
        Message obtainMessage = this.this$0.A0J.obtainMessage(36, i, 0, str);
        if (i == 2) {
            obtainMessage.getData().putParcelableArray("participant_jids", userJidArr);
        }
        obtainMessage.sendToTarget();
    }

    private void validateCallState(Voip.CallState callState) {
        boolean z = false;
        if (callState != Voip.CallState.RECEIVED_CALL_WITHOUT_OFFER) {
            z = true;
        }
        AnonymousClass00E.A09(z, "This call state is not supported in Android");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoCaptureStarted() {
        Log.i("VoiceService:videoCaptureStarted");
        this.this$0.A0J.sendEmptyMessage(13);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoCodecMismatch() {
        Log.i("VoiceService:videoCodecMismatch");
        this.this$0.A1H.A03(R.string.video_call_fallback_to_voice_call);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoCodecStateChanged() {
        Log.i("VoiceService:videoCodecStateChanged");
        this.this$0.A0J.removeMessages(15);
        this.this$0.A0J.sendEmptyMessage(15);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoDecodeFatalError() {
        Log.i("VoiceService:videoDecodeFatalError");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoDecodePaused() {
        Log.i("VoiceService:videoDecodePaused");
        this.this$0.A0J.removeMessages(15);
        this.this$0.A0J.sendEmptyMessage(15);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoDecodeResumed() {
        Log.i("VoiceService:videoDecodeResumed");
        this.this$0.A0J.removeMessages(15);
        this.this$0.A0J.sendEmptyMessage(15);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoDecodeStarted() {
        Log.i("VoiceService:videoDecodeStarted");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoEncodeFatalError() {
        Log.i("VoiceService:videoEncodeFatalError");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoPortCreateFailed() {
        Log.i("VoiceService:videoPortCreateFailed");
        this.this$0.A0P(17, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoPortCreated(String str) {
        AnonymousClass008.A18("VoiceService:videoPortCreated ", str);
        this.this$0.A0J.obtainMessage(7).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoPreviewError() {
        Log.i("VoiceService:videoPreviewError");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoPreviewReady() {
        Log.i("VoiceService:videoPreviewReady");
        this.this$0.A0J.sendEmptyMessage(9);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoRenderFormatChanged(String str) {
        this.this$0.A0J.obtainMessage(10, str).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoRenderStarted(String str) {
        AnonymousClass008.A18("VoiceService:videoRenderStarted ", str);
        this.this$0.A0J.obtainMessage(8, str).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoStreamCreateError() {
        Log.i("VoiceService:videoStreamCreateError");
        this.this$0.A0P(16, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void weakWifiSwitchedToCellular() {
        Log.i("VoiceService:weakWifiSwitchedToCellular");
        this.this$0.A0J.sendEmptyMessage(35);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void willCreateSoundPort() {
        Log.i("VoiceService:willCreateSoundPort");
    }
}
