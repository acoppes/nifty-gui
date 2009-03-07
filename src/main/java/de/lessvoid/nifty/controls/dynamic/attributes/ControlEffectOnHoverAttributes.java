package de.lessvoid.nifty.controls.dynamic.attributes;

import de.lessvoid.nifty.loaderv2.types.EffectTypeOnHover;

public class ControlEffectOnHoverAttributes extends ControlEffectAttributes {
  private ControlHoverAttributes controlHoverAttributes;

  public void setControlHoverAttributes(final ControlHoverAttributes controlHoverAttributesParam) {
    controlHoverAttributes = controlHoverAttributesParam;
  }

  public EffectTypeOnHover create() {
    EffectTypeOnHover effectTypeOnHover = new EffectTypeOnHover();
    effectTypeOnHover.initFromAttributes(attributes);
    if (controlHoverAttributes != null) {
      effectTypeOnHover.setHover(controlHoverAttributes.create());
    }
    return effectTypeOnHover;
  }
}
