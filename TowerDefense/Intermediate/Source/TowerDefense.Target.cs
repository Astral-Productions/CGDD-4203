using UnrealBuildTool;

public class TowerDefenseTarget : TargetRules
{
	public TowerDefenseTarget(TargetInfo Target) : base(Target)
	{
		DefaultBuildSettings = BuildSettingsVersion.Latest;
		IncludeOrderVersion = EngineIncludeOrderVersion.Latest;
		Type = TargetType.Game;
		ExtraModuleNames.Add("TowerDefense");
	}
}
