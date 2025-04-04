import os
import yaml

# Define the base directory as the current working directory
BASE_DIR = os.getcwd()

# Load the solutions.yaml file
yaml_file = os.path.join(BASE_DIR, "solutions.yaml")
with open(yaml_file, "r") as file:
    solutions = yaml.safe_load(file)

# Function to detect the language based on the solution name or content
def detect_language(solution_name, solution_code):
    # Check for specific keywords or extensions to determine the language
    if solution_name.lower().endswith(".c"):
        return "C"
    elif solution_name.lower().endswith(".py"):
        return "Python"
    elif solution_name.lower().endswith(".java"):
        return "Java"
    elif solution_name.lower().endswith(".go"):
        return "Go"
    elif solution_name.lower().endswith(".cpp") or solution_name.lower().endswith(".cc"):
        return "C++"
    else:
        # Default to Java if no specific language is detected
        return "Java"

# Function to create directories and files
def create_structure(solutions):
    for problem, solutions_data in solutions.items():
        # Skip empty entries
        if not solutions_data:
            continue

        # Format the problem name for the directory
        problem_dir_name = problem.replace(" ", "-")
        problem_dir_path = os.path.join(BASE_DIR, problem_dir_name)

        # Create the problem directory
        os.makedirs(problem_dir_path, exist_ok=True)

        # Create solution files
        for solution_name, solution_code in solutions_data.items():
            if solution_code:  # Skip empty solutions
                # Detect the language
                language = detect_language(solution_name, solution_code)

                # Create a subdirectory for the detected language
                language_dir_path = os.path.join(problem_dir_path, language)
                os.makedirs(language_dir_path, exist_ok=True)

                # Create the solution file
                solution_file_path = os.path.join(language_dir_path, solution_name)
                with open(solution_file_path, "w") as solution_file:
                    solution_file.write(solution_code)

# Run the function to create the structure
create_structure(solutions)