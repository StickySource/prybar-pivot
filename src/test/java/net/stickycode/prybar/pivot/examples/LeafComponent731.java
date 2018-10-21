package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent731
    implements PrybarComponent {

  private RootComponent731 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent731.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent731.class, "root"));
  }

  public RootComponent731 getRoot() {
    return root;
  }

}
