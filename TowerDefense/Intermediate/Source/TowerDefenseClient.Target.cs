using UnrealBuildTool;

public class TowerDefenseClientTarget : TargetRules
{
	public TowerDefenseClientTarget(TargetInfo Target) : base(Target)
	{
		DefaultBuildSettings = BuildSettingsVersion.Latest;
		IncludeOrderVersion = EngineIncludeOrderVersion.Latest;
		Type = TargetType.Client;
		ExtraModuleNames.Add("TowerDefense");
	}
}
