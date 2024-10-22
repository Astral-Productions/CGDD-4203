using UnrealBuildTool;

public class TowerDefenseServerTarget : TargetRules
{
	public TowerDefenseServerTarget(TargetInfo Target) : base(Target)
	{
		DefaultBuildSettings = BuildSettingsVersion.Latest;
		IncludeOrderVersion = EngineIncludeOrderVersion.Latest;
		Type = TargetType.Server;
		ExtraModuleNames.Add("TowerDefense");
	}
}
