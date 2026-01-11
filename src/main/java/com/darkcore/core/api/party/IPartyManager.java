package com.darkcore.core.api.party;

import java.util.UUID;
import java.util.Set;

public interface IPartyManager {
    void createParty(UUID leader);
    void disbandParty(UUID partyId);
    void addMember(UUID partyId, UUID member);
    void removeMember(UUID partyId, UUID member);
    Set<UUID> getMembers(UUID partyId);
    UUID getParty(UUID player);
    boolean isLeader(UUID player, UUID partyId);
}
