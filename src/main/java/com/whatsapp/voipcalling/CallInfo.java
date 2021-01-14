package com.whatsapp.voipcalling;

import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass0QY;
import X.AnonymousClass1VY;
import X.AnonymousClass1YO;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.Voip;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CallInfo {
    public long ECMode;
    public long audioDuration;
    public long bytesReceived;
    public long bytesSent;
    public long callActiveTime;
    public long callDuration;
    public boolean callEnding;
    public final String callId;
    public int callResult;
    public int callSetupErrorType;
    public final Voip.CallState callState;
    public AnonymousClass1YO callWaitingInfo;
    public final UserJid creatorJid;
    public final GroupJid groupJid;
    public int initialGroupTransactionId;
    public final UserJid initialPeerJid;
    public boolean isCaller;
    public boolean isEndedByMe;
    public boolean isGroupCall;
    public boolean isGroupCallCreatedOnServer;
    public boolean isGroupCallEnabled;
    public final boolean isJoinableGroupCall;
    public final Map participants = new LinkedHashMap();
    public final UserJid peerJid;
    public AnonymousClass0QY self;
    public boolean videoCaptureStarted;
    public long videoDuration;
    public boolean videoEnabled;
    public boolean videoPreviewReady;

    public CallInfo(Voip.CallState callState2, String str, UserJid userJid, UserJid userJid2, UserJid userJid3, GroupJid groupJid2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, boolean z7, boolean z8, boolean z9, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i3, boolean z10) {
        this.callState = callState2;
        this.callId = str;
        this.peerJid = userJid;
        this.initialPeerJid = userJid2;
        this.creatorJid = userJid3;
        this.groupJid = groupJid2;
        this.isCaller = z;
        this.isGroupCall = z2;
        this.isGroupCallEnabled = z3;
        this.isGroupCallCreatedOnServer = z4;
        this.videoEnabled = z5;
        this.isEndedByMe = z6;
        this.callResult = i;
        this.callSetupErrorType = i2;
        this.callEnding = z7;
        this.videoPreviewReady = z8;
        this.videoCaptureStarted = z9;
        this.callActiveTime = j;
        this.callDuration = j2;
        this.audioDuration = j3;
        this.videoDuration = j4;
        this.bytesSent = j5;
        this.bytesReceived = j6;
        this.ECMode = j7;
        this.initialGroupTransactionId = i3;
        this.isJoinableGroupCall = z10;
    }

    private void addParticipantInfo(UserJid userJid, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, boolean z9, int i3, int i4, int i5, boolean z10, boolean z11, int i6, boolean z12) {
        boolean z13 = true;
        if (i < 1 || (i > 7 && i != 11)) {
            z13 = false;
        }
        StringBuilder sb = new StringBuilder("invalid participant state ");
        sb.append(i);
        AnonymousClass00E.A08(z13, sb.toString());
        AnonymousClass0QY r2 = new AnonymousClass0QY(userJid, i, z, z2, z3, z4, z5, z6, z7, z8, z9, i2, i3, i4, i5, z10, z11, i6, z12);
        this.participants.put(userJid, r2);
        if (r2.A0D) {
            this.self = r2;
        }
    }

    public static CallInfo convertCallWaitingInfoToCallInfo(CallInfo callInfo) {
        Voip.CallState callState2;
        AnonymousClass1YO r8 = callInfo.callWaitingInfo;
        boolean z = true;
        if (r8.A01 == 1) {
            callState2 = Voip.CallState.RECEIVED_CALL;
        } else {
            callState2 = Voip.CallState.ACTIVE;
        }
        UserJid userJid = r8.A03.initialPeerJid;
        if (userJid != null) {
            String str = r8.A04;
            UserJid userJid2 = (UserJid) r8.A05.get(0);
            GroupJid groupJid2 = r8.A02;
            if (r8.A00 <= 1) {
                z = false;
            }
            boolean z2 = callInfo.isGroupCallEnabled;
            boolean z3 = r8.A06;
            CallInfo callInfo2 = new CallInfo(callState2, str, userJid, userJid, userJid2, groupJid2, false, z, z2, false, z3, false, 0, 0, false, false, false, 0, 0, 0, 0, 0, 0, 0, -1, false);
            AnonymousClass0QY r0 = callInfo.self;
            callInfo2.addParticipantInfo(r0.A06, r0.A01, true, false, r0.A09, r0.A0C, r0.A0A, 1, r0.A0I, r0.A0H, r0.A0G, r0.A0F, r0.A05, r0.A02, r0.A03 * 90, r0.A07, r0.A08, r0.A00, r0.A0E);
            for (UserJid userJid3 : r8.A05) {
                callInfo2.addParticipantInfo(userJid3, 2, false, false, false, false, false, z3 ? 1 : 0, false, false, false, false, 0, 0, 0, false, false, 0, false);
            }
            callInfo2.setCallWaitingInfo(false, 0, "", 0, new String[0], null, false, false, 0, 0, false, null);
            return callInfo2;
        }
        throw null;
    }

    public boolean enableAudioVideoSwitch() {
        return this.self.A07;
    }

    public long getAudioDuration() {
        return this.audioDuration;
    }

    public long getBytesReceived() {
        return this.bytesReceived;
    }

    public long getBytesSent() {
        return this.bytesSent;
    }

    public long getCallActiveTime() {
        return this.callActiveTime;
    }

    public long getCallDuration() {
        return this.callDuration;
    }

    public String getCallId() {
        return this.callId;
    }

    public int getCallResult() {
        return this.callResult;
    }

    public int getCallSetupErrorType() {
        return this.callSetupErrorType;
    }

    public Voip.CallState getCallState() {
        return this.callState;
    }

    public AnonymousClass1YO getCallWaitingInfo() {
        return this.callWaitingInfo;
    }

    public int getConnectedParticipantsCount() {
        int i = 0;
        for (Map.Entry entry : this.participants.entrySet()) {
            if (((AnonymousClass0QY) entry.getValue()).A01 == 1) {
                i++;
            }
        }
        return i;
    }

    public UserJid getCreatorJid() {
        return this.creatorJid;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0QY getDefaultPeerInfo() {
        /*
            r5 = this;
            boolean r0 = r5.isGroupCall
            r4 = 0
            if (r0 == 0) goto L_0x0006
            return r4
        L_0x0006:
            java.util.Map r0 = r5.participants
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x0010:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r2 = r3.next()
            X.0QY r2 = (X.AnonymousClass0QY) r2
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x002a
            com.whatsapp.jid.UserJid r1 = r2.A06
            com.whatsapp.jid.UserJid r0 = r5.peerJid
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0010
        L_0x002a:
            return r2
        L_0x002b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallInfo.getDefaultPeerInfo():X.0QY");
    }

    public long getECMode() {
        return this.ECMode;
    }

    public GroupJid getGroupJid() {
        return this.groupJid;
    }

    public AnonymousClass0QY getInfoByJid(UserJid userJid) {
        return (AnonymousClass0QY) this.participants.get(userJid);
    }

    public UserJid getInitialPeerJid() {
        return this.initialPeerJid;
    }

    public Set getParticipantJids() {
        return this.participants.keySet();
    }

    public Map getParticipants() {
        return this.participants;
    }

    public UserJid getPeerJid() {
        return this.peerJid;
    }

    public AnonymousClass0QY getSelfInfo() {
        return this.self;
    }

    public long getVideoDuration() {
        return this.videoDuration;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 == 3) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasOutgoingParticipantInActiveOneToOneCall() {
        /*
            r3 = this;
            com.whatsapp.voipcalling.Voip$CallState r1 = r3.callState
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.ACTIVE
            if (r1 != r0) goto L_0x001d
            X.0QY r0 = r3.getDefaultPeerInfo()
            if (r0 == 0) goto L_0x001d
            X.0QY r0 = r3.getDefaultPeerInfo()
            int r2 = r0.A01
            r0 = 2
            if (r2 == r0) goto L_0x0019
            r0 = 3
            r1 = 0
            if (r2 != r0) goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallInfo.hasOutgoingParticipantInActiveOneToOneCall():boolean");
    }

    public int initialGroupTransactionId() {
        return this.initialGroupTransactionId;
    }

    public boolean isCallEnding() {
        return this.callEnding;
    }

    public boolean isCallOnHold() {
        if (this.self.A09) {
            return true;
        }
        for (AnonymousClass0QY r1 : this.participants.values()) {
            if (!(r1.A0D || r1.A09)) {
                return false;
            }
        }
        return true;
    }

    public boolean isCaller() {
        return this.isCaller;
    }

    public boolean isEitherSideRequestingUpgrade() {
        AnonymousClass0QY r0;
        if (this.isGroupCall || this.callState == Voip.CallState.NONE || (r0 = this.self) == null) {
            return false;
        }
        int i = r0.A04;
        boolean z = false;
        if (i == 3) {
            z = true;
        }
        if (z || isPeerRequestingUpgrade()) {
            return true;
        }
        return false;
    }

    public boolean isEndedByMe() {
        return this.isEndedByMe;
    }

    public boolean isGroupCall() {
        return this.isGroupCall;
    }

    public boolean isGroupCallCreatedOnServer() {
        return this.isGroupCallCreatedOnServer;
    }

    public boolean isGroupCallEnabled() {
        return this.isGroupCallEnabled;
    }

    public boolean isInLonelyState() {
        if (this.callState != Voip.CallState.ACTIVE) {
            return false;
        }
        for (AnonymousClass0QY r1 : this.participants.values()) {
            if (r1.A01 == 1 && !r1.A0D) {
                return false;
            }
        }
        return true;
    }

    public boolean isJoinableGroupCall() {
        return this.isJoinableGroupCall;
    }

    public boolean isPeerRequestingUpgrade() {
        AnonymousClass0QY defaultPeerInfo = getDefaultPeerInfo();
        if (defaultPeerInfo != null) {
            boolean z = false;
            if (defaultPeerInfo.A04 == 3) {
                z = true;
            }
            return z;
        }
    }

    public boolean isSelfRequestingUpgrade() {
        AnonymousClass0QY r2;
        return !this.isGroupCall && (r2 = this.self) != null && this.callState != Voip.CallState.NONE && r2.A04 == 3;
    }

    public boolean isVideoCaptureStarted() {
        return this.videoCaptureStarted;
    }

    public boolean isVideoEnabled() {
        return this.videoEnabled;
    }

    public boolean isVideoPreviewReady() {
        return this.videoPreviewReady;
    }

    private void setCallWaitingInfo(boolean z, int i, String str, int i2, String[] strArr, String str2, boolean z2, boolean z3, int i3, int i4, boolean z4, Voip.CallLogInfo callLogInfo) {
        this.callWaitingInfo = new AnonymousClass1YO(i, str, i2, AnonymousClass1VY.A0G(UserJid.class, Arrays.asList(strArr)), str2, z2, callLogInfo);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("CallId: ");
        A0S.append(this.callId);
        A0S.append(", peerJid: ");
        A0S.append(this.peerJid);
        A0S.append(", callState: ");
        A0S.append(this.callState);
        return A0S.toString();
    }
}
