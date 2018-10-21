package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent245
    implements PrybarComponent {

  private RootComponent245 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent245.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent245.class, "root"));
  }

  public RootComponent245 getRoot() {
    return root;
  }

}
