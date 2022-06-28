using System;

static class QuestLogic
{
    public static bool CanFastAttack(bool knightIsAwake)
    {
        bool fastAttack = true;
      if(knightIsAwake){
         fastAttack = false;
      } 
        return fastAttack;
    }

    public static bool CanSpy(bool knightIsAwake, bool archerIsAwake, bool prisonerIsAwake)
    {
        bool spy = (archerIsAwake == true) || (knightIsAwake == true) || (prisonerIsAwake == true);
      return spy;
    }

    public static bool CanSignalPrisoner(bool archerIsAwake, bool prisonerIsAwake)
    {
        bool signal = (prisonerIsAwake == true) && (archerIsAwake == false);
        return signal;
    }

    public static bool CanFreePrisoner(bool knightIsAwake, bool archerIsAwake, bool prisonerIsAwake, bool petDogIsPresent)
    {
        bool freePrisoner = false;
        if (petDogIsPresent){
            freePrisoner = (archerIsAwake == false);
        }else {
             freePrisoner = ((prisonerIsAwake == true) && (archerIsAwake == false) && (knightIsAwake == false));
        }
        return freePrisoner;
    }
}
