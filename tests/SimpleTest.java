import com.intellij.ide.plugins.PluginManager;
import com.intellij.openapi.extensions.PluginId;
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;

public class SimpleTest extends LightCodeInsightFixtureTestCase {

    public void testThatWeHaveAProject() {
        assertNotNull(myFixture.getProject());
    }

    public void testThatWeHaveOurOwnPlugin() {
        assertEquals("idea-travis-ci-test-plugin", PluginManager.getPlugin(PluginId.getId("de.espend.idea.travis-ci")).getName());
    }
}
