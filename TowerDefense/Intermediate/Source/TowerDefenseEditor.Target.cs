using UnrealBuildTool;

public class TowerDefenseEditorTarget : TargetRules
{
	public TowerDefenseEditorTarget(TargetInfo Target) : base(Target)
	{
		DefaultBuildSettings = BuildSettingsVersion.Latest;
		IncludeOrderVersion = EngineIncludeOrderVersion.Latest;
		Type = TargetType.Editor;
		ExtraModuleNames.Add("TowerDefense");
	}
}
