package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent958
    implements PrybarComponent {

  private RootComponent958 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent958.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent958.class, "root"));
  }

  public RootComponent958 getRoot() {
    return root;
  }

}
