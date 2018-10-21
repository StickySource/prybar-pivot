package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent564
    implements PrybarComponent {

  private RootComponent564 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent564.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent564.class, "root"));
  }

  public RootComponent564 getRoot() {
    return root;
  }

}
