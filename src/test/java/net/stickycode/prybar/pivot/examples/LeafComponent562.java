package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent562
    implements PrybarComponent {

  private RootComponent562 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent562.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent562.class, "root"));
  }

  public RootComponent562 getRoot() {
    return root;
  }

}
